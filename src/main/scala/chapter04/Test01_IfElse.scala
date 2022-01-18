package chapter04

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    // 1.单分支
    if(age >= 18){
      println("成年")
    }

    println("===============")

    // 2.双分支
    if(age >= 18){
      println("成年")
    }else{
      println("未成年")
    }

    // 分支语句的返回值
    val result: Any = if(age >= 18){
                            println("成年")
                            "成年"
                         }else{
                            println("未成年")
                            age
                         }

    println(result)


    val res: String = if(age >= 18){
      "成年"
    }else{
      "未成年"
    }

    val res2 = if(age >= 18) "成年" else "未成年"

  }
}
