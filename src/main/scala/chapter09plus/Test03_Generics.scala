package chapter09plus

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 1.协变和逆变
    val child: Parent = new Child
//    val childList: MyCollection[Parent] = new MyCollection[Child]
    val childList: MyCollection[subChild] = new MyCollection[Child]

    // 2.上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }

    test[Child](new subChild)
  }
}

// 定义继承关系
class Parent {}
class Child extends Parent {}
class subChild extends Child {}

// 定义带泛型的集合类型
class MyCollection[-E] {}

//
