 package com.today36524.api.common.scala.domain.serializer;

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

        class PageRequestSerializer extends BeanSerializer[com.today36524.api.common.scala.domain.PageRequest]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.api.common.scala.domain.PageRequest = {

        var schemeField: com.github.dapeng.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var start: Int = 0
        var limit: Int = 0
        var sortFields: Option[String] = None
        

      while (schemeField == null || schemeField.`type` != com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => start = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.I32 => limit = iprot.readI32
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.github.dapeng.org.apache.thrift.protocol.TType.STRING => sortFields = Option(iprot.readString)
                    case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.api.common.scala.domain.PageRequest(start = start,limit = limit,sortFields = sortFields)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.api.common.scala.domain.PageRequest, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("PageRequest"))

      
            {
            val elem0 = bean.start 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("start", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.limit 
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("limit", com.github.dapeng.org.apache.thrift.protocol.TType.I32, 2.asInstanceOf[Short]))
            oprot.writeI32(elem1)
            oprot.writeFieldEnd
            
            }
            if(bean.sortFields.isDefined){
            val elem2 = bean.sortFields .get
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("sortFields", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, 3.asInstanceOf[Short]))
            oprot.writeString(elem2)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.api.common.scala.domain.PageRequest): Unit = {
      
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.api.common.scala.domain.PageRequest): String = if (bean == null) "null" else bean.toString

        }
        
      