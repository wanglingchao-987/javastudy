package day0914反射.apply;

import java.lang.reflect.Method;

public class Get类方法 {
    public static void main(String[] args) {
         Class<Person> p1 = Person.class;
         //获取类名
         String name = p1.getName();
        System.out.println(name);
        //获取类方法  getMethods:获取当前运行时类及其父类中的public权限的方法

         Method[] methods = p1.getMethods();
        for (Method m1:methods
             ) {
            System.out.println(m1);

        }//
        //getDeclaredMethods:获取当前运行时类中申明的方法，不包括父类。





         Method[] methods1 = p1.getDeclaredMethods();
        for (Method m2:methods1
        ) {
            System.out.println(m2);

        }


    }
}
