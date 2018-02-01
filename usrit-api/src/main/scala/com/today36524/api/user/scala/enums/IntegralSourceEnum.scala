package com.today36524.api.user.scala.enums;

      class IntegralSourceEnum private(val id: Int, val name: String) extends com.github.dapeng.core.enums.TEnum(id,name) {}

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      * 

 积分来源

      **/
      object IntegralSourceEnum {

      
            val PREFECT_INFORMATION = new IntegralSourceEnum(1, "完善个人资料")
          
            val BLACK = new IntegralSourceEnum(2, "拉黑")
          
      val UNDEFINED = new IntegralSourceEnum(-1,"UNDEFINED") // undefined enum
      

      def findByValue(v: Int): IntegralSourceEnum = {
        v match {
          case 1 => PREFECT_INFORMATION
            case 2 => BLACK
            
          case _ => new IntegralSourceEnum(v,"#"+ v)
        }
      }

      def apply(v: Int) = findByValue(v)
      def unapply(v: IntegralSourceEnum): Option[Int] = Some(v.id)

    }
    