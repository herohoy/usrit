package com.today36524.api.user.request;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 手机号获取单个用户请求体

        **/
        public class GetUserByTelephoneRequest{
        
            /**
            *

 用户手机号

            **/
            public String telephone ;
            public String getTelephone(){ return this.telephone; }
            public void setTelephone(String telephone){ this.telephone = telephone; }

            public String telephone(){ return this.telephone; }
            public GetUserByTelephoneRequest telephone(String telephone){ this.telephone = telephone; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("telephone").append("\":\"").append(this.telephone).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      