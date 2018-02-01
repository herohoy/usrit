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

        class UnfreezeUserSqlResponseSerializer extends BeanSerializer[com.today36524.api.user.scala.response.UnfreezeUserSqlResponse]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.api.user.scala.response.UnfreezeUserSqlResponse = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var userId: String = null
        var status: Int = 0
        var remark: String = null
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => userId = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => status = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => remark = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.api.user.scala.response.UnfreezeUserSqlResponse(userId = userId,status = status,remark = remark)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.api.user.scala.response.UnfreezeUserSqlResponse, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("UnfreezeUserSqlResponse"))

      
            {
            val elem0 = bean.userId 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userId", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.status 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("status", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 2.asInstanceOf[Short]))
            oprot.writeI32(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.remark 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("remark", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 3.asInstanceOf[Short]))
            oprot.writeString(elem2)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.api.user.scala.response.UnfreezeUserSqlResponse): Unit = {
      
              if(bean.userId == null)
              throw new SoaException(SoaCode.NotNull, "userId字段不允许为空")
            
              if(bean.remark == null)
              throw new SoaException(SoaCode.NotNull, "remark字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.api.user.scala.response.UnfreezeUserSqlResponse): String = if (bean == null) "null" else bean.toString

        }
        
      