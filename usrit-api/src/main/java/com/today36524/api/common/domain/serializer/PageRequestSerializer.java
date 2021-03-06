 package com.today36524.api.common.domain.serializer;
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
        public class PageRequestSerializer implements BeanSerializer<com.today36524.api.common.domain.PageRequest>{
        
      @Override
      public com.today36524.api.common.domain.PageRequest read(TProtocol iprot) throws TException{

      com.today36524.api.common.domain.PageRequest bean = new com.today36524.api.common.domain.PageRequest();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setStart(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setLimit(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setSortFields(Optional.of(elem0));
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
      public void write(com.today36524.api.common.domain.PageRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("PageRequest"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("start", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getStart();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("limit", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getLimit();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          if(bean.getSortFields().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("sortFields", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 3));
              String elem2 = bean.getSortFields().get();
              oprot.writeString(elem2);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today36524.api.common.domain.PageRequest bean) throws TException{
      
    }
    
        @Override
        public String toString(com.today36524.api.common.domain.PageRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      