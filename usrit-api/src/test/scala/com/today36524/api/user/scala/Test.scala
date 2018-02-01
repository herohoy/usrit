package com.today36524.api.user.scala

import com.today36524.api.common.scala.domain.PageRequest
import com.today36524.api.user.scala.request.FindUsersByPageRequest

object Test {
  def main(args: Array[String]): Unit = {
    val cl :
      UserServiceClient = new UserServiceClient
//      UserServiceAsyncClient = new UserServiceAsyncClient
    val rsp = cl.findUsersByPage(FindUsersByPageRequest(
      pageRequest = PageRequest(start = 0,limit = 3)))
    println(rsp)
  }
}
