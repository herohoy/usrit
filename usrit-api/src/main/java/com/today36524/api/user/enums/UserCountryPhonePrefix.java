package com.today36524.api.user.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 会员用户所在国家区域电话号码前缀

        **/
        public enum UserCountryPhonePrefix implements com.github.dapeng.org.apache.thrift.TEnum{
        
            /**
            *
            **/
            CN(86),
          
            /**
            *
            **/
            JP(81),
          
            /**
            *
            **/
            KR(82),
          
            /**
            *
            **/
            US(1),
          
            /**
            *
            **/
            UK(44);
          

        private final int value;

        private UserCountryPhonePrefix(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static UserCountryPhonePrefix findByValue(int value){
            switch(value){
            
                 case 86:
                    return CN;
               
                 case 81:
                    return JP;
               
                 case 82:
                    return KR;
               
                 case 1:
                    return US;
               
                 case 44:
                    return UK;
               
               default:
                   return null;
            }
        }
        }
      