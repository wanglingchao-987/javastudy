package day0914反射.学生类演练;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentDemo {
    public static void main(String[] args)  throws  Exception {
        //通过反射给成员变量赋值

        Class<?> c1 = Class.forName("day0914反射.学生类演练.Student");
        System.out.println("=============获取public成员变量们=================");
        //获取public 成员变量们
        Field[] fields = c1.getFields();
        for (  Field fs:fields
             ) {
            System.out.println(fs);

        }
        System.out.println("==============成员变量赋值和设置==================");
        //成员变量赋值和设置
        //获取成员变量的值
        Field feild=c1.getField("id");
        Student st1 = new Student();
        Object val1 = feild.get(st1);
        System.out.println(val1);
        //给成员变量赋值
        feild.set(st1,"001");
        System.out.println(st1);
        //获取所有的包括私有的属性
        System.out.println("===========获取所有的包括私有的属性=============");
        Field name1 = c1.getDeclaredField("name");
        name1.setAccessible(true);

        name1.set(st1,"周东雨");
        Object nm = name1.get(st1);
        System.out.println(nm);

        System.out.println("=================获取构造方法===============");
        //获取无参的构造方法
        Constructor<?> con = c1.getDeclaredConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
        //简化的方式:类对象..newInstance();
        Object instance1 = c1.newInstance();
        //获取带参数的构造方法，并赋值
        System.out.println("获取带参数的构造方法，并赋值");
        Constructor<?> con1 = c1.getDeclaredConstructor(String.class, int.class);
       Object obj1 = con1.newInstance("张三", 20);
        System.out.println(obj1);
        //获取另外一个构造方法。
        Constructor<?> con2 = c1.getDeclaredConstructor(String.class);
         Object obj2 = con2.newInstance("王五");
        System.out.println(obj2);

        System.out.println("给属性赋值");


        //给属性赋值
        //s.name="林青霞“。
         Field name = c1.getDeclaredField("name");
         name.setAccessible(true);
        name.set(obj,"林青霞");
        System.out.println(obj);
        //s.age=30;
         Field age = c1.getDeclaredField("age");
         //取消访问检查
         age.setAccessible(true);
         age.set(obj,30);
        System.out.println(obj);

        //获取单个方法
        System.out.println("获取单个方法-公共方法");
      Method eat = c1.getMethod("eat");
      eat.invoke(obj);
      //获取单个私有方法

        System.out.println("获取单个私有方法");
         Method run = c1.getDeclaredMethod("run");
         run.setAccessible(true);
         Student S2=new Student();
         run.invoke(S2);
        System.out.println("====================获取所有public修饰的方法和方法名===================");
         //获取所有public修饰的方法和方法名
        Method[] methods00 = c1.getMethods();
        for ( Method met:methods00
             ) {
            System.out.println(met);
            //获取方法名
            String name2 = met.getName();
            System.out.println(name2);

        }
        System.out.println("===================获取类名：=====================");
        String n1 = c1.getName();
        System.out.println(n1);


    }
}
