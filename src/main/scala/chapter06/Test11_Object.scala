package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val student = new Student11("alice", 18)
//    student.printInfo()

    val student = Student11.newStudent("alice", 18)
    student.printInfo()

    val student2 = Student11.apply("bob", 19)
    student2.printInfo()

    val student3 = Student11("bob", 19)
    student3.printInfo()
  }
}

// 定义类
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = $name, age = $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11 {
  val school: String = "b站"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
