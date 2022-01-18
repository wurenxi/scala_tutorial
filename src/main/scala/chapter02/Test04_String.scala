package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // 1.字符串，通过+号连接
    val name: String = "alice"
    val age: Int = 8
    println(age + "岁的" + name + "在b站学习")

    // * 用于将一个字符串复制多次拼接
    println(name * 3)

    // 2.printf用法：字符串，通过%传值
    printf("%d岁的%s在b站学习\n",age,name)

    // 字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在b站学习")

    val num: Float = 2.3456f
    println(f"The num is ${num}%2.2f") // 格式化模板字符串
    println(raw"\nThe num is ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin

    println(sql)
  }
}
