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
        public class PageResponseSerializer implements BeanSerializer<com.today36524.api.common.domain.PageResponse>{
        
      @Override
      public com.today36524.api.common.domain.PageResponse read(TProtocol iprot) throws TException{

      com.today36524.api.common.domain.PageResponse bean = new com.today36524.api.common.domain.PageResponse();
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
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setResults(elem0);
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
      public void write(com.today36524.api.common.domain.PageResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("PageResponse"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("start", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getStart();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("limit", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getLimit();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("results", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 3));
            Integer elem2 = bean.getResults();
            oprot.writeI32(elem2);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.today36524.api.common.domain.PageResponse bean) throws TException{
      
    }
    
        @Override
        public String toString(com.today36524.api.common.domain.PageResponse bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      