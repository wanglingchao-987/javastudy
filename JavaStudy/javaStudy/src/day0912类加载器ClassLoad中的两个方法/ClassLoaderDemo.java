package day0912类加载器ClassLoad中的两个方法;

public class ClassLoaderDemo {
    //返回用于委派的系统类加载器
    public static void main(String[] args) {
        //返回用于委派的系统类加载器

        ClassLoader c1=ClassLoader.getSystemClassLoader();
        System.out.println(c1);//sun.misc.Launcher$AppClassLoader@18b4aac2
       ClassLoader c3 = ClassLoaderDemo.class.getClassLoader();
        System.out.println(c3);
        System.out.println(c3==c1); //true
        //返回父类加载器进行委托,即扩展类加载器
        //ClassLoader c2=ClassLoader.getSystemClassLoader().getParent();
        ClassLoader c2=c1.getParent();
        System.out.println(c2);//sun.misc.Launcher$ExtClassLoader@75b84c92
        //获取引导类加载器：主要负责加载java的核心类库，无法加载自定义的。
         ClassLoader parentc4 = c2.getParent();
        System.out.println(parentc4);//null

    }
}
