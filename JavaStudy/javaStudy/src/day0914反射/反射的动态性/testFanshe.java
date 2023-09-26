package day0914反射.反射的动态性;

import java.util.Random;
//体会反射的动态性。

public class testFanshe {
    public static void main(String[] args) throws Exception {
         int num = new Random().nextInt(3);
         String  classPath="";
         switch (num){

             case 0:
                 classPath="java.util.Date";
                 break;
             case 1:
                 classPath="E:\\javaStudy\\src\\day0914反射\\反射的动态" +
                         "性\\testFanshe.java";
                 break;
             case 2:
                 classPath="E:\\javaStudy\\src\\day0912类" +
                         "加载器ClassLoad中的两个方法";
                 break;
         }
         Object inst0 = getInstance(classPath);
        System.out.println(inst0);

    }
    public static Object getInstance(String classPath) throws Exception {
        Class<?> class1 = Class.forName(classPath);
        return class1.newInstance();
    }
}
