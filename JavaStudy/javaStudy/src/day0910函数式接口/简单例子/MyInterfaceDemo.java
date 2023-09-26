package day0910函数式接口.简单例子;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my =()-> System.out.println("函数式接口");
        my.show();//触发了Lambda表达式的执行。


    }
}
