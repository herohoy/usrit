 package com.today36524.api.user.request.serializer;
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
        public class GetUserByTelephoneRequestSerializer implements BeanSerializer<com.today36524.api.user.request.GetUserByTelephoneRequest>{
        
      @Override
      public com.today36524.api.user.request.GetUserByTelephoneRequest read(TProtocol iprot) throws TException{

      com.today36524.api.user.request.GetUserByTelephoneRequest bean = new com.today36524.api.user.request.GetUserByTelephoneRequest();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setTelephone(elem0);
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
      public void write(com.today36524.api.user.request.GetUserByTelephoneRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("GetUserByTelephoneRequest"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("telephone", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getTelephone();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today36524.api.user.request.GetUserByTelephoneRequest bean) throws TException{
      
              if(bean.getTelephone() == null)
              throw new SoaException(SoaCode.NotNull, "telephone字段不允许为空");
            
    }
    
        @Override
        public String toString(com.today36524.api.user.request.GetUserByTelephoneRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      