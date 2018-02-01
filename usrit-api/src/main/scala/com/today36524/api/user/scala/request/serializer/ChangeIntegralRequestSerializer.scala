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

        class ChangeIntegralRequestSerializer extends BeanSerializer[com.today36524.api.user.scala.request.ChangeIntegralRequest]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.api.user.scala.request.ChangeIntegralRequest = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var userId: String = null
        var integralPrice: String = null
        var integralType: com.today36524.api.user.scala.enums.IntegralTypeEnum = null
        var integralSource: com.today36524.api.user.scala.enums.IntegralSourceEnum = null
        

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
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => integralPrice = iprot.readString
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => integralType = 
          com.today36524.api.user.scala.enums.IntegralTypeEnum.findByValue(iprot.readI32)
        
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => integralSource = 
          com.today36524.api.user.scala.enums.IntegralSourceEnum.findByValue(iprot.readI32)
        
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.api.user.scala.request.ChangeIntegralRequest(userId = userId,integralPrice = integralPrice,integralType = integralType,integralSource = integralSource)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.api.user.scala.request.ChangeIntegralRequest, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("ChangeIntegralRequest"))

      
            {
            val elem0 = bean.userId 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userId", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.integralPrice 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("integralPrice", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 2.asInstanceOf[Short]))
            oprot.writeString(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.integralType 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("integralType", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 3.asInstanceOf[Short]))
            oprot.writeI32(elem2.id)
            oprot.writeFieldEnd
            
            }
            {
            val elem3 = bean.integralSource 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("integralSource", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 4.asInstanceOf[Short]))
            oprot.writeI32(elem3.id)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.api.user.scala.request.ChangeIntegralRequest): Unit = {
      
              if(bean.userId == null)
              throw new SoaException(SoaCode.NotNull, "userId字段不允许为空")
            
              if(bean.integralPrice == null)
              throw new SoaException(SoaCode.NotNull, "integralPrice字段不允许为空")
            
              if(bean.integralType == null)
              throw new SoaException(SoaCode.NotNull, "integralType字段不允许为空")
            
              if(bean.integralSource == null)
              throw new SoaException(SoaCode.NotNull, "integralSource字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.api.user.scala.request.ChangeIntegralRequest): String = if (bean == null) "null" else bean.toString

        }
        
      