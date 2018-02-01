package com.today36524.api.user.scala.service

import com.github.dapeng.core.{SoaBaseCodeInterface, SoaException}
import com.today.service.commons.Assert
import com.today.service.commons.exception.CommonException
import com.today36524.api.common.scala.domain.PageResponse
import com.today36524.api.user.scala.dao.UserDao
import com.today36524.api.user.scala.enums.UserStatusEnum
import com.today36524.api.user.scala.request._
import com.today36524.api.user.scala.response._
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import wangzx.scala_commons.sql.{BeanBuilder, Row}

import scala.util.matching.Regex

class UserServiceImpl extends UserService {
  @Autowired
  var userDao:UserDao = _

  val LOGGER = LoggerFactory.getLogger(classOf[UserServiceImpl])

  val USERNAME_REG: Regex = """^[A-Za-z]{1}[A-Za-z0-9-_.]{1,19}$""".r
  val PWD_REG = """^[\S]{8,20}$""".r
  val CELL_REG = """^1{1}[3578]{1}[0-9]{9}$""".r
  val MAIL_REG = """^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$""".r
  val QQ_REG = """\d{4,12}""".r
  val INT_REG = """^[0-9]{1,10}$""".r
  /**
  ### 用户注册
    **/
  override def registerUser(request: RegisterUserRequest): RegisterUserResponse
  = {
    LOGGER.debug("注册服务调用开始")
    Assert.assert(!(request.userName==null || request.userName.isEmpty),
      CommonException.illegalArgumentException("用户名不能为空"))
    Assert assert(USERNAME_REG.pattern.matcher(request.userName).matches,
      CommonException.illegalArgumentException("用户名必须为2-20位的英文字母与数字组合，且首字符必须为字母"))
    Assert.assert(!(request.passWord==null || request.passWord.isEmpty),
      CommonException.illegalArgumentException("密码不能为空"))
    Assert.assert(PWD_REG.pattern.matcher(request.passWord).matches,
      CommonException.illegalArgumentException("密码必须为8-20位的任意字符"))
    Assert.assert(!(request.telephone==null || request.telephone.isEmpty),
      CommonException.illegalArgumentException("手机号不能为空"))
    Assert.assert(CELL_REG.pattern.matcher(request.telephone).matches,
      CommonException.illegalArgumentException("手机号不符合规范"))

    Assert.assert(userDao.getUserCountByPhone(request.telephone) < 1,
      CommonException.illegalArgumentException("手机号已注册"))

    //密码加密处理过程 TODO

      val res = userDao.addUserForRegister(request)
    LOGGER.debug("注册服务调用完毕")
    BeanBuilder.build[RegisterUserResponse](res)(
      "userName" -> res.cell("user_name").getString,
      "telephone" -> res.cell("telephone").getString,
      "status" -> UserStatusEnum(res.cell("status").getInt),
      "createdAt" -> res.cell("created_at").getDate.getTime
    )
  }

  /**
  ### 用户登录
    **/
override def login(request: LoginUserRequest): LoginUserResponse ={
  LOGGER.debug("登录服务调用开始")
  Assert.assert(!(request.telephone==null || request.telephone.isEmpty),
    CommonException.illegalArgumentException("手机号不能为空"))
  Assert.assert(CELL_REG.pattern.matcher(request.telephone).matches,
    CommonException.illegalArgumentException("手机号不符合规范"))
  //使用手机号判断用户是否存在
  Assert.assert(userDao.getUserCountByPhone(request.telephone) == 1,
    CommonException.dataIsEmpty("手机号未注册"))

  //密码加密处理过程 TODO

  //登录
  val u = userDao.authUser(request).getOrElse(throw new SoaException("","密码不正确"))

  Assert.assert(UserStatusEnum(u.cell("status").getInt)!=UserStatusEnum.UNDEFINED,
    CommonException.dataIsEmpty("该用户状态未知，请联系管理员"))
  Assert.assert(UserStatusEnum(u.cell("status").getInt)!=UserStatusEnum.DELETE,
    CommonException.dataIsEmpty("该用户已被删除，请联系管理员"))
  Assert.assert(UserStatusEnum(u.cell("status").getInt)!=UserStatusEnum.BLACK,
    CommonException.dataIsEmpty("该用户已被列入黑名单，请联系管理员"))

  LOGGER.debug("登录服务调用完毕")
  BeanBuilder.build[LoginUserResponse](u)(
    "userName" -> u.cell("user_name").getString,
    "telephone" -> u.cell("telephone").getString,
    "status" -> UserStatusEnum(u.cell("status").getInt),
    "integral" -> u.cell("integral").getInt,
    "createdAt" -> u.cell("created_at").getDate.getTime,
    "updatedAt" -> u.cell("updated_at").getDate.getTime,
    "email" -> Option(u.cell("email").getString),
    "qq" -> Option(u.cell("qq").getString)
  )

}

  /**
    * ### 用户修改个人资料
    **/
  override def modifyUser(request: ModifyUserRequest): ModifyUserResponse =
    {
      LOGGER.debug("修改个人资料服务调用开始")
      Assert.assert(!(request.email==null || request.email.isEmpty),CommonException.illegalArgumentException("邮箱不能为空"))
      Assert.assert(MAIL_REG.pattern.matcher(request.email).matches,
        CommonException.illegalArgumentException("邮箱不符合规范"))
      Assert.assert(!(request.qq==null || request.qq.isEmpty),CommonException.illegalArgumentException("QQ号不能为空"))
      Assert.assert(QQ_REG.pattern.matcher(request.qq).matches,
        CommonException.illegalArgumentException("QQ号不符合规范"))

      val status = userDao.getUserStatus(request.userId)
      //使用id判断用户是否存在
      Assert.assert(status.isInstanceOf[Some[Int]],CommonException.dataIsEmpty("用户不存在"))

      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.UNDEFINED,
        CommonException.dataIsEmpty("该用户状态未知，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.DELETE,
        CommonException.dataIsEmpty("该用户已被删除，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.BLACK,
        CommonException.dataIsEmpty("该用户已被列入黑名单，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.FREEZED,
        CommonException.dataIsEmpty("该用户已被冻结，请联系管理员"))

      val r = userDao.updateUserForIntegral(request)

      LOGGER.debug("修改个人资料服务调用完毕")
      BeanBuilder.build[ModifyUserResponse](r)(
        "userName" -> r.cell("user_name").getString,
        "telephone" -> r.cell("telephone").getString,
        "status" -> UserStatusEnum(r.cell("status").getInt),
        "updatedAt" -> r.cell("updated_at").getDate.getTime,
        "email" -> Option(r.cell("email").getString),
        "qq" -> Option(r.cell("qq").getString)
      )
      /*ModifyUserResponse(r.cell("user_name").getString,r.cell("telephone").getString,
        UserStatusEnum(r.cell("status").getInt),r.cell("updated_at").getDate.getTime,
        Option(r.cell("email").getString),Option(r.cell("qq").getString))*/
    }

  /**
    * ### 冻结用户接口
    **/
  override def freezeUser(request: FreezeUserRequest): FreezeUserResponse =
    {
      LOGGER.debug("冻结用户服务调用开始")
      val status = userDao.getUserStatus(request.userId)
      Assert.assert(status.isInstanceOf[Some[Int]],CommonException.dataIsEmpty("用户不存在"))

      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.UNDEFINED,
        CommonException.dataIsEmpty("该用户状态未知，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.DELETE,
        CommonException.dataIsEmpty("该用户已被删除，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.BLACK,
        CommonException.dataIsEmpty("该用户已被列入黑名单，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.FREEZED,
        CommonException.dataIsEmpty("该用户已被冻结，请联系管理员"))

      val r = userDao.updateUserFreeze(request)
      LOGGER.debug("冻结用户服务调用完毕")
      BeanBuilder.build[FreezeUserResponse](r)(
        "userId" -> r.userId,
        "status" -> UserStatusEnum(r.status),
        "remark" -> r.remark
      )
    }

  /**
    * ### 拉黑用户接口
    **/
  override def blackUser(request: BlackUserRequest): BlackUserResponse =
    {
      LOGGER.debug("拉黑用户服务调用开始")
      val status = userDao.getUserStatus(request.userId)
      Assert.assert(status.isInstanceOf[Some[Int]],CommonException.dataIsEmpty("用户不存在"))

      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.UNDEFINED,
        CommonException.dataIsEmpty("该用户状态未知，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.DELETE,
        CommonException.dataIsEmpty("该用户已被删除，请联系管理员"))
      Assert.assert(UserStatusEnum(status.get)!=UserStatusEnum.BLACK,
        CommonException.dataIsEmpty("该用户已被列入黑名单，请联系管理员"))

      val r = userDao.updateUserBlack(request)
      LOGGER.debug("拉黑用户服务调用完毕")
      BeanBuilder.build[BlackUserResponse](r)(
        "userId" -> r.userId,
        "status" -> UserStatusEnum(r.status),
        "remark" -> r.remark
      )
    }

  /**
    * ### 记录积分改变流水
    **/
  override def changeUserIntegral(request: ChangeIntegralRequest): Int =
    {
      LOGGER.debug("记录积分服务调用开始")
      Assert.assert(INT_REG.pattern.matcher(request.integralPrice).matches,
        CommonException.illegalArgumentException("数字格式不正确"))
      Assert.assert(userDao.getUserCountById(request.userId) == 1,CommonException.dataIsEmpty("用户不存在"))
      LOGGER.debug("记录积分服务调用完毕")
      userDao.updateIntegralChange(request)
    }

  /**
    * ### 解冻用户接口
    **/
  override def unfreezeUser(request: UnfreezeUserRequest): UnfreezeUserResponse =
    {
      LOGGER.debug("解冻用户服务调用开始")
      val status = userDao.getUserStatus(request.userId)
      Assert.assert(status.isInstanceOf[Some[Int]],CommonException.dataIsEmpty("用户不存在"))

      Assert.assert(UserStatusEnum(status.get)==UserStatusEnum.FREEZED,
        CommonException.dataIsEmpty("该用户并非处于冻结状态"))

      val r = userDao.updateUserUnfreeze(request)
      LOGGER.debug("解冻用户服务调用完毕")
      BeanBuilder.build[UnfreezeUserResponse](r)(
        "userId" -> r.userId,
        "status" -> UserStatusEnum(r.status),
        "remark" -> r.remark
      )
    }

  override def getUser(request: GetUserRequest): GetUserResponse = {
    val r = userDao.getUser(request)
    Assert.assert(r.isDefined,CommonException.dataIsEmpty("未找到用户"))
    BeanBuilder.build[GetUserResponse](r)(
      "userName" -> r.get.userName,
      "telephone" -> r.get.telephone,
      "email" -> r.get.email,
      "qq" -> r.get.qq,
      "status" -> UserStatusEnum(r.get.status),
      "integral" -> r.get.integral,
      "createdAt" -> r.get.createdAt,
      "updatedAt" -> r.get.updatedAt
    )
  }

  override def getUserByTelephone(request: GetUserByTelephoneRequest): GetUserResponse = {
    val r = userDao.getUser(request)
    Assert.assert(r.isDefined,CommonException.dataIsEmpty("未找到用户"))
    BeanBuilder.build[GetUserResponse](r)(
      "userName" -> r.get.cell("user_name").getString,
      "telephone" -> r.get.cell("telephone").getString,
      "email" -> r.get.cell("email").getString,
      "qq" -> r.get.cell("qq").getString,
      "status" -> UserStatusEnum(r.get.cell("status").getInt),
      "integral" -> r.get.cell("integral").getInt,
      "createdAt" -> r.get.cell("created_at").getDate.getTime,
      "updatedAt" -> r.get.cell("updated_at").getDate.getTime
    )
  }

  override def findUsersByPage(request: FindUsersByPageRequest): FindUsersByPageResponse =
    {
      val obj: List[GetUserResponse] =
        for(r <- userDao.queryUsersByPage(request))
          yield {
        BeanBuilder.build[GetUserResponse](r)(
          "userName" -> r.cell("user_name").getString,
          "telephone" -> r.cell("telephone").getString,
          "email" -> r.cell("email").getString,
          "qq" -> r.cell("qq").getString,
          "status" -> UserStatusEnum(r.cell("status").getInt),
          "integral" -> r.cell("integral").getInt,
          "createdAt" -> r.cell("created_at").getDate.getTime,
          "updatedAt" -> r.cell("updated_at").getDate.getTime
        )
      }
      val pgres = BeanBuilder.build[PageResponse](request)(
          "start" -> request.pageRequest.start,
        "limit" -> request.pageRequest.limit,
        "results" -> userDao.queryUsersTotalCount(request)
      )
      BeanBuilder.build[FindUsersByPageResponse](obj,request)(
        "pageResponse" -> pgres,
        "results" -> obj
      )
    }
}
