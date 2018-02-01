package com.today36524.api.common.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 分页查询请求包

        **/
        public class PageRequest{
        
            /**
            *

 查询的开始序号（序号从零开始）

            **/
            public int start ;
            public int getStart(){ return this.start; }
            public void setStart(int start){ this.start = start; }

            public int start(){ return this.start; }
            public PageRequest start(int start){ this.start = start; return this; }
          
            /**
            *

 返回记录数

            **/
            public int limit ;
            public int getLimit(){ return this.limit; }
            public void setLimit(int limit){ this.limit = limit; }

            public int limit(){ return this.limit; }
            public PageRequest limit(int limit){ this.limit = limit; return this; }
          
            /**
            *

 排序的字段

            **/
            public Optional<String> sortFields = Optional.empty();
            public Optional<String> getSortFields(){ return this.sortFields; }
            public void setSortFields(Optional<String> sortFields){ this.sortFields = sortFields; }

            public Optional<String> sortFields(){ return this.sortFields; }
            public PageRequest sortFields(Optional<String> sortFields){ this.sortFields = sortFields; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("start").append("\":").append(this.start).append(",");
    stringBuilder.append("\"").append("limit").append("\":").append(this.limit).append(",");
    stringBuilder.append("\"").append("sortFields").append("\":\"").append(this.sortFields.isPresent()?this.sortFields.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      