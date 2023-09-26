package day0912反射.三种方式获取Class对象;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        /*//使用类的class属性来获取class对象
         Class<Student> c1 = Student.class;
        System.out.println(c1);
        //调用对象的getClass方法，返回该对象所属类对象的class对象
        Student s=new Student("王者");
        System.out.println("111111111111111111111111111111111");
      System.out.println(  s.toString() );
        Class<? extends Student> c2 = s.getClass();
        System.out.println(c2);
        //使用class中的静态方法forName(String className)
        Class<?> c3 = Class.forName("day0912反射.三种方式获取Class对象.Student");
        System.out.println(c3);
        System.out.println("========================================");
         Class<?> c5 = Class.forName("day0912反射.三种方式获取Class对象.Student");
       // Constructor<?>[] getConstructors()返回一个包含 Constructor对象的数组，
         Constructor<?>[] c6 = c5.getConstructors();
        for (Constructor cc:
             c6) {
            System.out.println(cc);

        }

       *//* System.out.println(c5);
        System.out.println("===============================");
        //获取class方法的实例方法对象
         Constructor<Student> c4 = c1.getConstructor();
        System.out.println(c4);
*//*
*/
        //调用运行时类的属性
        /* Class<Student> s1 = Student.class;
        System.out.println(s1);
        //2.通过运行时类的对象，调用getClass(),
       Student s2 = new Student();
      Class s3= s2.getClass();
      //调用Class的静态方法：forName(String classPath)
        //3.调用Class的静态方法：forName(String  classpath);
         Class s4 = Class.forName("day0912反射.三种方式获取Class对象.Student");
        System.out.println(s4);
        System.out.println(s1 == s3);
        System.out.println(s3==s4);
        //4.使用类的加载器*/

        //1.Class.forName("全类名"):多用于配置文件，将类名定义在配置文件中，读取文件，加载类。

        Class<?> cls = Class.forName("day0912反射.三种方式获取Class对象.Student");
        //2.类名.class  //多用于参数的传递
        Class<Student> cls1 = Student.class;
        Student stu = new Student();
        //对象名.getclass:  、、多用于对象的获取字节码的方式
        Class<? extends Student> cls2 = stu.getClass();
    }


}