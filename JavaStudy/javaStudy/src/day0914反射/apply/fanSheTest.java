package day0914反射.apply;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class fanSheTest {
    public static void main(String[] args) {
        Class class1= Person.class;
        //获取属性结构
        //获取当前运行时类及其父类中申明为public访问权限的属性
         Field[] f1 = class1.getFields();
        for (Field f:f1
             ) {
            System.out.println(f);

            }
        //getDeclaredFields():获取当前运行时类当中申明的所有属性，不包含父类的属性，
        //
        Field[] declaredFields0 = class1.getDeclaredFields();
        for (Field f2:declaredFields0
        ) {
            System.out.println(f2);
        }
        System.out.println("===========================================");
        Field[] declaredFields1 = class1.getDeclaredFields();
        for (Field f3:declaredFields1
        ) {
            //权限修饰符
             int modifiers0 = f3.getModifiers();
            System.out.print(Modifier.toString(modifiers0));
            System.out.println("===========================================");
            ////变量的数据类型
             Class<?> type = f3.getType();
            System.out.println(type.getName());
            System.out.println("===========================================");
            //变量名
           String name = f3.getName();
            System.out.println(name);


        }

        //变量名



        }
}
