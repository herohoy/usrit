package com.today36524.api.common.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class PageResponse{
        
            /**
            *

 查询的开始序号（序号从零开始）

            **/
            public int start ;
            public int getStart(){ return this.start; }
            public void setStart(int start){ this.start = start; }

            public int start(){ return this.start; }
            public PageResponse start(int start){ this.start = start; return this; }
          
            /**
            *

 最大返回的记录数

            **/
            public int limit ;
            public int getLimit(){ return this.limit; }
            public void setLimit(int limit){ this.limit = limit; }

            public int limit(){ return this.limit; }
            public PageResponse limit(int limit){ this.limit = limit; return this; }
          
            /**
            *

 结果记录数

            **/
            public int results ;
            public int getResults(){ return this.results; }
            public void setResults(int results){ this.results = results; }

            public int results(){ return this.results; }
            public PageResponse results(int results){ this.results = results; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("start").append("\":").append(this.start).append(",");
    stringBuilder.append("\"").append("limit").append("\":").append(this.limit).append(",");
    stringBuilder.append("\"").append("results").append("\":").append(this.results).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      