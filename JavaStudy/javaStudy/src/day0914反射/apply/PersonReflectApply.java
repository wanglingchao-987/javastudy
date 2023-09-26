package day0914反射.apply;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonReflectApply {
    public static void main(String[] args) throws Exception {
        //Person  p =new Person();
        Class<?> c = Class.forName("day0914反射.apply.Person");

         Constructor<?> constructor = c.getConstructor();
         Object obj = constructor.newInstance();
         //
         Method m1 = c.getMethod("Person");
         Object invoke = m1.invoke(obj);
        System.out.println(invoke);

    }
}
