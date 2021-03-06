 package com.today36524.api.user.response.serializer;
        import com.today36524.api.common.domain.serializer.*;import com.today36524.api.user.response.serializer.*;import com.today36524.api.user.request.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class FreezeUserResponseSerializer implements BeanSerializer<com.today36524.api.user.response.FreezeUserResponse>{
        
      @Override
      public com.today36524.api.user.response.FreezeUserResponse read(TProtocol iprot) throws TException{

      com.today36524.api.user.response.FreezeUserResponse bean = new com.today36524.api.user.response.FreezeUserResponse();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setUserId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
              com.today36524.api.user.enums.UserStatusEnum elem0 = com.today36524.api.user.enums.UserStatusEnum.findByValue(iprot.readI32());
       bean.setStatus(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setRemark(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.today36524.api.user.response.FreezeUserResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("FreezeUserResponse"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userId", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getUserId();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("status", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 2));
            com.today36524.api.user.enums.UserStatusEnum elem1 = bean.getStatus();
            oprot.writeI32(elem1.getValue());
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("remark", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 3));
            String elem2 = bean.getRemark();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today36524.api.user.response.FreezeUserResponse bean) throws TException{
      
              if(bean.getUserId() == null)
              throw new SoaException(SoaCode.NotNull, "userId字段不允许为空");
            
              if(bean.getStatus() == null)
              throw new SoaException(SoaCode.NotNull, "status字段不允许为空");
            
              if(bean.getRemark() == null)
              throw new SoaException(SoaCode.NotNull, "remark字段不允许为空");
            
    }
    
        @Override
        public String toString(com.today36524.api.user.response.FreezeUserResponse bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      