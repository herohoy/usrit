package com.today36524.api.user.response;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 用户登录sql返回体

        **/
        public class LoginUserSqlResponse{
        
            /**
            *

 用户名称

            **/
            public String userName ;
            public String getUserName(){ return this.userName; }
            public void setUserName(String userName){ this.userName = userName; }

            public String userName(){ return this.userName; }
            public LoginUserSqlResponse userName(String userName){ this.userName = userName; return this; }
          
            /**
            *

 电话号码

            **/
            public String telephone ;
            public String getTelephone(){ return this.telephone; }
            public void setTelephone(String telephone){ this.telephone = telephone; }

            public String telephone(){ return this.telephone; }
            public LoginUserSqlResponse telephone(String telephone){ this.telephone = telephone; return this; }
          
            /**
            *

 用户状态

            **/
            public int status ;
            public int getStatus(){ return this.status; }
            public void setStatus(int status){ this.status = status; }

            public int status(){ return this.status; }
            public LoginUserSqlResponse status(int status){ this.status = status; return this; }
          
            /**
            *

 用户邮箱

            **/
            public Optional<String> email = Optional.empty();
            public Optional<String> getEmail(){ return this.email; }
            public void setEmail(Optional<String> email){ this.email = email; }

            public Optional<String> email(){ return this.email; }
            public LoginUserSqlResponse email(Optional<String> email){ this.email = email; return this; }
          
            /**
            *

 用户 qq

            **/
            public Optional<String> qq = Optional.empty();
            public Optional<String> getQq(){ return this.qq; }
            public void setQq(Optional<String> qq){ this.qq = qq; }

            public Optional<String> qq(){ return this.qq; }
            public LoginUserSqlResponse qq(Optional<String> qq){ this.qq = qq; return this; }
          
            /**
            *

 用户 积分

            **/
            public int integral ;
            public int getIntegral(){ return this.integral; }
            public void setIntegral(int integral){ this.integral = integral; }

            public int integral(){ return this.integral; }
            public LoginUserSqlResponse integral(int integral){ this.integral = integral; return this; }
          
            /**
            *

 注册时间

            **/
            public long createdAt ;
            public long getCreatedAt(){ return this.createdAt; }
            public void setCreatedAt(long createdAt){ this.createdAt = createdAt; }

            public long createdAt(){ return this.createdAt; }
            public LoginUserSqlResponse createdAt(long createdAt){ this.createdAt = createdAt; return this; }
          
            /**
            *

 更新时间

            **/
            public long updatedAt ;
            public long getUpdatedAt(){ return this.updatedAt; }
            public void setUpdatedAt(long updatedAt){ this.updatedAt = updatedAt; }

            public long updatedAt(){ return this.updatedAt; }
            public LoginUserSqlResponse updatedAt(long updatedAt){ this.updatedAt = updatedAt; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("userName").append("\":\"").append(this.userName).append("\",");
    stringBuilder.append("\"").append("telephone").append("\":\"").append(this.telephone).append("\",");
    stringBuilder.append("\"").append("status").append("\":").append(this.status).append(",");
    stringBuilder.append("\"").append("email").append("\":\"").append(this.email.isPresent()?this.email.get():null).append("\",");
    stringBuilder.append("\"").append("qq").append("\":\"").append(this.qq.isPresent()?this.qq.get():null).append("\",");
    stringBuilder.append("\"").append("integral").append("\":").append(this.integral).append(",");
    stringBuilder.append("\"").append("createdAt").append("\":").append(this.createdAt).append(",");
    stringBuilder.append("\"").append("updatedAt").append("\":").append(this.updatedAt).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      