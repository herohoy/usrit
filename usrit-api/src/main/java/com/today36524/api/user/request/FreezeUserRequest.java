package com.today36524.api.user.request;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 冻结操作请求体

        **/
        public class FreezeUserRequest{
        
            /**
            *

 用户 id

            **/
            public String userId ;
            public String getUserId(){ return this.userId; }
            public void setUserId(String userId){ this.userId = userId; }

            public String userId(){ return this.userId; }
            public FreezeUserRequest userId(String userId){ this.userId = userId; return this; }
          
            /**
            *

  操作员冻结备注

            **/
            public String remark ;
            public String getRemark(){ return this.remark; }
            public void setRemark(String remark){ this.remark = remark; }

            public String remark(){ return this.remark; }
            public FreezeUserRequest remark(String remark){ this.remark = remark; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("userId").append("\":\"").append(this.userId).append("\",");
    stringBuilder.append("\"").append("remark").append("\":\"").append(this.remark).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      