namespace java com.today36524.api.user.request

include 'common_domain.thrift'
include 'user_enum.thrift'

/**
* 注册用户请求体
**/
struct RegisterUserRequest {
    /**
    * 用户名称
    **/
    1: string userName,
    /**
    * 密码
    **/
    2: string passWord,
    /**
    * 电话号码
    **/
    3: string telephone,
}

/**
* 修改用户请求体(初始化修改时必填[积分相关]，之后修改选填)
**/
struct ModifyUserRequest {
    /**
    * 用户邮箱
    **/
    1: string email,
    /**
    * 用户 qq
    **/
    2: string qq,
    /**
    * 用户 id
    **/
    3: string userId,
}

/**
* 用户登录请求体
**/
struct LoginUserRequest {
    /**
    * 密码
    **/
    1: string passWord,
    /**
    * 电话号码
    **/
    2: string telephone,
}

/**
* 冻结操作请求体
**/
struct FreezeUserRequest {
    /**
    * 用户 id
    **/
    1: string userId,
    /**
    *  操作员冻结备注
    **/
    2: string remark,
}

/**
* 拉黑操作请求体
**/
struct BlackUserRequest {
    /**
    * 用户 id
    **/
    1: string userId,
    /**
    *  操作员拉黑备注
    **/
    2: string remark,
}

/**
* 记录请求流水接口
**/
struct ChangeIntegralRequest {
    /**
    * 用户 id
    **/
    1: string userId,
    /**
    *  该流水涉及到的积分数(可正可负)
    **/
    2: string integralPrice,
    /**
    *  积分流水类型
    **/
    3: user_enum.IntegralTypeEnum integralType,
    /**
    *  积分改变的来源
    **/
    4: user_enum.IntegralSourceEnum integralSource,
}


/**
* 解冻操作请求体
**/
struct UnfreezeUserRequest {
    /**
    * 用户 id
    **/
    1: string userId,
    /**
    *  操作员解冻备注
    **/
    2: string remark,
}

/**
* 获取单个用户请求体（默认用id获取用户）
**/
struct GetUserRequest{
    /**
    * 用户id
    **/
    1:string id
}

/**
* 手机号获取单个用户请求体
**/
struct GetUserByTelephoneRequest{
/**
* 用户手机号
**/
    1:string telephone
}

struct FindUsersByPageRequest{
    1:optional string userName,
    2:optional string telephone,
    3:optional string email,
    4:optional string qq,
    5:optional user_enum.UserStatusEnum status,
/**
* bg代表起始日期，ed代表结束日期
**/
    6:optional string createdAtBg,
    7:optional string createdAtEd,
    8:optional string updatedByBg,
    9:optional string updatedByEd
/**
* 分页参数
**/
    10:common_domain.PageRequest pageRequest
}
