package com.today36524.api.user.response;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 注册用户sql返回体

        **/
        public class RegisterUserSqlResponse{
        
            /**
            *

 用户名称

            **/
            public String userName ;
            public String getUserName(){ return this.userName; }
            public void setUserName(String userName){ this.userName = userName; }

            public String userName(){ return this.userName; }
            public RegisterUserSqlResponse userName(String userName){ this.userName = userName; return this; }
          
            /**
            *

 电话号码

            **/
            public String telephone ;
            public String getTelephone(){ return this.telephone; }
            public void setTelephone(String telephone){ this.telephone = telephone; }

            public String telephone(){ return this.telephone; }
            public RegisterUserSqlResponse telephone(String telephone){ this.telephone = telephone; return this; }
          
            /**
            *

 用户状态

            **/
            public int status ;
            public int getStatus(){ return this.status; }
            public void setStatus(int status){ this.status = status; }

            public int status(){ return this.status; }
            public RegisterUserSqlResponse status(int status){ this.status = status; return this; }
          
            /**
            *

 注册时间

            **/
            public long createdAt ;
            public long getCreatedAt(){ return this.createdAt; }
            public void setCreatedAt(long createdAt){ this.createdAt = createdAt; }

            public long createdAt(){ return this.createdAt; }
            public RegisterUserSqlResponse createdAt(long createdAt){ this.createdAt = createdAt; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("userName").append("\":\"").append(this.userName).append("\",");
    stringBuilder.append("\"").append("telephone").append("\":\"").append(this.telephone).append("\",");
    stringBuilder.append("\"").append("status").append("\":").append(this.status).append(",");
    stringBuilder.append("\"").append("createdAt").append("\":").append(this.createdAt).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      