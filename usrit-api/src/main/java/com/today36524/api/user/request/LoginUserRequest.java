package com.today36524.api.user.request;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 用户登录请求体

        **/
        public class LoginUserRequest{
        
            /**
            *

 密码

            **/
            public String passWord ;
            public String getPassWord(){ return this.passWord; }
            public void setPassWord(String passWord){ this.passWord = passWord; }

            public String passWord(){ return this.passWord; }
            public LoginUserRequest passWord(String passWord){ this.passWord = passWord; return this; }
          
            /**
            *

 电话号码

            **/
            public String telephone ;
            public String getTelephone(){ return this.telephone; }
            public void setTelephone(String telephone){ this.telephone = telephone; }

            public String telephone(){ return this.telephone; }
            public LoginUserRequest telephone(String telephone){ this.telephone = telephone; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("passWord").append("\":\"").append(this.passWord).append("\",");
    stringBuilder.append("\"").append("telephone").append("\":\"").append(this.telephone).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      