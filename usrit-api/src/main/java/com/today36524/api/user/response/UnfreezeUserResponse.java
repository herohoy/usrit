package com.today36524.api.user.response;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 解冻操作返回体

        **/
        public class UnfreezeUserResponse{
        
            /**
            *

 用户 id

            **/
            public String userId ;
            public String getUserId(){ return this.userId; }
            public void setUserId(String userId){ this.userId = userId; }

            public String userId(){ return this.userId; }
            public UnfreezeUserResponse userId(String userId){ this.userId = userId; return this; }
          
            /**
            *

 用户状态

            **/
            public com.today36524.api.user.enums.UserStatusEnum status ;
            public com.today36524.api.user.enums.UserStatusEnum getStatus(){ return this.status; }
            public void setStatus(com.today36524.api.user.enums.UserStatusEnum status){ this.status = status; }

            public com.today36524.api.user.enums.UserStatusEnum status(){ return this.status; }
            public UnfreezeUserResponse status(com.today36524.api.user.enums.UserStatusEnum status){ this.status = status; return this; }
          
            /**
            *

  操作员解冻备注

            **/
            public String remark ;
            public String getRemark(){ return this.remark; }
            public void setRemark(String remark){ this.remark = remark; }

            public String remark(){ return this.remark; }
            public UnfreezeUserResponse remark(String remark){ this.remark = remark; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("userId").append("\":\"").append(this.userId).append("\",");
    stringBuilder.append("\"").append("status").append("\":").append(this.status).append(",");
    stringBuilder.append("\"").append("remark").append("\":\"").append(this.remark).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      