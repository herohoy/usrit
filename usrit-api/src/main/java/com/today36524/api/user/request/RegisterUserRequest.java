package com.today36524.api.user.request;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 注册用户请求体

        **/
        public class RegisterUserRequest{
        
            /**
            *

 用户名称

            **/
            public String userName ;
            public String getUserName(){ return this.userName; }
            public void setUserName(String userName){ this.userName = userName; }

            public String userName(){ return this.userName; }
            public RegisterUserRequest userName(String userName){ this.userName = userName; return this; }
          
            /**
            *

 密码

            **/
            public String passWord ;
            public String getPassWord(){ return this.passWord; }
            public void setPassWord(String passWord){ this.passWord = passWord; }

            public String passWord(){ return this.passWord; }
            public RegisterUserRequest passWord(String passWord){ this.passWord = passWord; return this; }
          
            /**
            *

 电话号码

            **/
            public String telephone ;
            public String getTelephone(){ return this.telephone; }
            public void setTelephone(String telephone){ this.telephone = telephone; }

            public String telephone(){ return this.telephone; }
            public RegisterUserRequest telephone(String telephone){ this.telephone = telephone; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("userName").append("\":\"").append(this.userName).append("\",");
    stringBuilder.append("\"").append("passWord").append("\":\"").append(this.passWord).append("\",");
    stringBuilder.append("\"").append("telephone").append("\":\"").append(this.telephone).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      