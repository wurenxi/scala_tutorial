package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // 1.范围遍历
    for (i <- 1 to 10){
      println(i + ". hello world")
    }

    for(i <- 1.to(10)){
      println(i + ". hello world")
    }

    println("=====================")

//    for(i <- Range(1,10)){
//      println(i + ". hello world")
//    }
    for(i <- 1 until 10){
      println(i + ". hello world")
    }

    println("==================")
    // 2.集合遍历
    for(i <- Array(12,23,53)){
      println(i)
    }
    for(i <- List(12,23,53)){
      println(i)
    }
    for(i <- Set(12,23,53)){
      println(i)
    }

    println("=========================")
    // 3.循环守卫
    for(i <- 1 to 10 if i != 5){
      println(i)
    }

    // 4.循环步长
    for(i <- 1 to 10 by 2){
      println(i)
    }


  }
}
