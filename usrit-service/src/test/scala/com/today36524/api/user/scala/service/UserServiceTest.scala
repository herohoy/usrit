package com.today36524.api.user.scala.service

import com.today36524.api.common.scala.domain.PageRequest
import com.today36524.api.user.scala.UserServiceClient
import com.today36524.api.user.scala.request.FindUsersByPageRequest
import org.springframework.context.support.ClassPathXmlApplicationContext

object UserServiceTest {
  def main(args: Array[String]): Unit = {

//    val resource = classOf[UserServiceImpl].getClassLoader.getResources("META-INF/spring/services.xml")


    val cl : UserServiceClient = new UserServiceClient
    val rsp = cl.findUsersByPage(FindUsersByPageRequest(
      pageRequest = PageRequest(start = 0,limit = 3)))
    println(rsp)
  }
}
