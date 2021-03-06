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
        public class ModifyUserResponseSerializer implements BeanSerializer<com.today36524.api.user.response.ModifyUserResponse>{
        
      @Override
      public com.today36524.api.user.response.ModifyUserResponse read(TProtocol iprot) throws TException{

      com.today36524.api.user.response.ModifyUserResponse bean = new com.today36524.api.user.response.ModifyUserResponse();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setUserName(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setTelephone(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
              com.today36524.api.user.enums.UserStatusEnum elem0 = com.today36524.api.user.enums.UserStatusEnum.findByValue(iprot.readI32());
       bean.setStatus(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setEmail(Optional.of(elem0));
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 5:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setQq(Optional.of(elem0));
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 6:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I64){
              long elem0 = iprot.readI64();
       bean.setUpdatedAt(elem0);
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
      public void write(com.today36524.api.user.response.ModifyUserResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("ModifyUserResponse"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userName", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getUserName();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("telephone", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 2));
            String elem1 = bean.getTelephone();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("status", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 3));
            com.today36524.api.user.enums.UserStatusEnum elem2 = bean.getStatus();
            oprot.writeI32(elem2.getValue());
            
            oprot.writeFieldEnd();
          if(bean.getEmail().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("email", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 4));
              String elem3 = bean.getEmail().get();
              oprot.writeString(elem3);
              
            }
            if(bean.getQq().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("qq", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem4 = bean.getQq().get();
              oprot.writeString(elem4);
              
            }
            
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("updatedAt", com.github.dapeng.org.apache.thrift.protocol.TType.I64, (short) 6));
            Long elem5 = bean.getUpdatedAt();
            oprot.writeI64(elem5);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today36524.api.user.response.ModifyUserResponse bean) throws TException{
      
              if(bean.getUserName() == null)
              throw new SoaException(SoaCode.NotNull, "userName字段不允许为空");
            
              if(bean.getTelephone() == null)
              throw new SoaException(SoaCode.NotNull, "telephone字段不允许为空");
            
              if(bean.getStatus() == null)
              throw new SoaException(SoaCode.NotNull, "status字段不允许为空");
            
    }
    
        @Override
        public String toString(com.today36524.api.user.response.ModifyUserResponse bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      