package day0910引用构造器.引用方法;

import java.util.Locale;

public class PrintDemo {
    public static void main(String[] args) {
        usePrinter((String s)->{
            String a=s.toUpperCase();
            System.out.println(a);
        });
        //方法引用：引用对象的实例方法。
         PrintString ps = new PrintString();
         usePrinter(ps::printUpper);
         //Lambda表达式被对象的实例代替的时候，他的形式参数全部传递给该方法作为参数

    }
     private  static void usePrinter(Printer p){
        p.PrintUpperCase("abcd");

    }
}
