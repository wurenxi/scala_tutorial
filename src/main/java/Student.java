import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gxl
 * @description
 * @createDate 2022/1/12 20:51
 */
public class Student {
    private String name;
    private Integer age;
    private static String school = "atguigu";

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name+" "+this.age+" "+Student.school);
    }

    public static void main(String[] args) throws Exception {
//        Class<?> student = Class.forName("Student");
//        Constructor<?> studentConstructor = student.getConstructor(String.class,Integer.class);
//        Student instance = (Student) studentConstructor.newInstance("gxl",18);
//        instance.printInfo();

        Student alice = new Student("alice", 20);
        Student bob = new Student("bob", 23);
        alice.printInfo();
        bob.printInfo();
    }
}
