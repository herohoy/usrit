package com.today36524.api.user.request;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 修改用户请求体(初始化修改时必填[积分相关]，之后修改选填)

        **/
        public class ModifyUserRequest{
        
            /**
            *

 用户邮箱

            **/
            public String email ;
            public String getEmail(){ return this.email; }
            public void setEmail(String email){ this.email = email; }

            public String email(){ return this.email; }
            public ModifyUserRequest email(String email){ this.email = email; return this; }
          
            /**
            *

 用户 qq

            **/
            public String qq ;
            public String getQq(){ return this.qq; }
            public void setQq(String qq){ this.qq = qq; }

            public String qq(){ return this.qq; }
            public ModifyUserRequest qq(String qq){ this.qq = qq; return this; }
          
            /**
            *

 用户 id

            **/
            public String userId ;
            public String getUserId(){ return this.userId; }
            public void setUserId(String userId){ this.userId = userId; }

            public String userId(){ return this.userId; }
            public ModifyUserRequest userId(String userId){ this.userId = userId; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("email").append("\":\"").append(this.email).append("\",");
    stringBuilder.append("\"").append("qq").append("\":\"").append(this.qq).append("\",");
    stringBuilder.append("\"").append("userId").append("\":\"").append(this.userId).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      