 package com.today36524.api.user.scala.response.serializer;

        import com.today36524.api.user.scala.request.serializer._;import com.today36524.api.common.scala.domain.serializer._;import com.today36524.api.user.scala.response.serializer._;
        import com.github.dapeng.core._
        import com.github.dapeng.org.apache.thrift._
        import com.github.dapeng.org.apache.thrift.protocol._

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/

        class LoginUserSqlResponseSerializer extends BeanSerializer[com.today36524.api.user.scala.response.LoginUserSqlResponse]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.api.user.scala.response.LoginUserSqlResponse = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var userName: String = null
        var telephone: String = null
        var status: Int = 0
        var email: Option[String] = None
        var qq: Option[String] = None
        var integral: Int = 0
        var createdAt: Long = 0
        var updatedAt: Long = 0
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => userName = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => telephone = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => status = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => email = Option(iprot.readString)
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 5 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => qq = Option(iprot.readString)
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 6 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => integral = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 7 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I64 => createdAt = iprot.readI64
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 8 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I64 => updatedAt = iprot.readI64
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.api.user.scala.response.LoginUserSqlResponse(userName = userName,telephone = telephone,status = status,email = email,qq = qq,integral = integral,createdAt = createdAt,updatedAt = updatedAt)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.api.user.scala.response.LoginUserSqlResponse, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("LoginUserSqlResponse"))

      
            {
            val elem0 = bean.userName 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userName", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.telephone 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("telephone", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 2.asInstanceOf[Short]))
            oprot.writeString(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.status 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("status", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 3.asInstanceOf[Short]))
            oprot.writeI32(elem2)
            oprot.writeFieldEnd
            
            }
            if(bean.email.isDefined){
            val elem3 = bean.email .get
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("email", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 4.asInstanceOf[Short]))
            oprot.writeString(elem3)
            oprot.writeFieldEnd
            
            }
            if(bean.qq.isDefined){
            val elem4 = bean.qq .get
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("qq", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 5.asInstanceOf[Short]))
            oprot.writeString(elem4)
            oprot.writeFieldEnd
            
            }
            {
            val elem5 = bean.integral 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("integral", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 6.asInstanceOf[Short]))
            oprot.writeI32(elem5)
            oprot.writeFieldEnd
            
            }
            {
            val elem6 = bean.createdAt 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("createdAt", com.github.dapeng.org.apache.thrift.protocol.TType.I64, 7.asInstanceOf[Short]))
            oprot.writeI64(elem6)
            oprot.writeFieldEnd
            
            }
            {
            val elem7 = bean.updatedAt 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("updatedAt", com.github.dapeng.org.apache.thrift.protocol.TType.I64, 8.asInstanceOf[Short]))
            oprot.writeI64(elem7)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.api.user.scala.response.LoginUserSqlResponse): Unit = {
      
              if(bean.userName == null)
              throw new SoaException(SoaCode.NotNull, "userName字段不允许为空")
            
              if(bean.telephone == null)
              throw new SoaException(SoaCode.NotNull, "telephone字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.api.user.scala.response.LoginUserSqlResponse): String = if (bean == null) "null" else bean.toString

        }
        
      