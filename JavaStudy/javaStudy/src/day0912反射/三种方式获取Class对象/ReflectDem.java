package day0912反射.三种方式获取Class对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDem {
    public static void main(String[] args) throws Exception {
       // Class的理解：
        Class<Student> c1 = Student.class;

        // 通过反射创建对象
        Constructor<Student> con = c1.getConstructor(String.class);
        Object stu = con.newInstance("张三");
        Student stu1 = (Student) stu;
        System.out.println(stu1);

        // 通过反射调用属性 Field name = c1.getDeclaredField("name");
        //        name.setAccessible(true);
        //        System.out.println(name.get(stu1));


        // 通过反射调用方法
        Method a = c1.getDeclaredMethod("A");
        a.setAccessible(true);
        System.out.println(a.invoke(stu1));
        //
    }
}