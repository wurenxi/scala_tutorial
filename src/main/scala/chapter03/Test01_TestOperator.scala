package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1.算数运算符
    val result = 10 / 3
    println(result)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.toDouble / 3
    println(result3.formatted("%5.2f"))

    val result4: Int = 10 % 3
    println(result4)

    // 2.比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")

    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))

    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))
  }
}
