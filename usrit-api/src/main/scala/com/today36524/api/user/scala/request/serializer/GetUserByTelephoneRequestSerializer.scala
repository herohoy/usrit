 package com.today36524.api.user.scala.request.serializer;

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

        class GetUserByTelephoneRequestSerializer extends BeanSerializer[com.today36524.api.user.scala.request.GetUserByTelephoneRequest]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.api.user.scala.request.GetUserByTelephoneRequest = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var telephone: String = null
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => telephone = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.api.user.scala.request.GetUserByTelephoneRequest(telephone = telephone)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.api.user.scala.request.GetUserByTelephoneRequest, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("GetUserByTelephoneRequest"))

      
            {
            val elem0 = bean.telephone 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("telephone", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.api.user.scala.request.GetUserByTelephoneRequest): Unit = {
      
              if(bean.telephone == null)
              throw new SoaException(SoaCode.NotNull, "telephone字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.api.user.scala.request.GetUserByTelephoneRequest): String = if (bean == null) "null" else bean.toString

        }
        
      