package com.today36524.api.user.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 积分流水类型

        **/
        public enum IntegralTypeEnum implements com.github.dapeng.org.apache.thrift.TEnum{
        
            /**
            *

 流水不变（预留，可用于查询）

            **/
            SHOW(0),
          
            /**
            *

 增加流水

            **/
            ADD(1),
          
            /**
            *

 减少流水

            **/
            MINUS(2);
          

        private final int value;

        private IntegralTypeEnum(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static IntegralTypeEnum findByValue(int value){
            switch(value){
            
                 case 0:
                    return SHOW;
               
                 case 1:
                    return ADD;
               
                 case 2:
                    return MINUS;
               
               default:
                   return null;
            }
        }
        }
      