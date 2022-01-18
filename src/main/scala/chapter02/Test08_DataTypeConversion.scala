package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 自动提升原则，有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的多钟数据类型
    val a1: Byte = 20
    val b1: Long = 2553
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1).toInt

    // 把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte

    // (byte, short)和char之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
//    val c3: Byte = b3 // error
    val c3: Int = b3
    println(c3)

    // byte, short, char三者可以计算，在计算时首先转换为Int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    val result44: Int = a4 + b4 + c4
    println(result44)
  }
}
