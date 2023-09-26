package day0918.annotationAppply;

import java.lang.reflect.Method;

@Annio(className = "day0917Reflect.Teacher", methodName = "teach")
public class AnnotationImpl {
    public static void main(String[] args) throws Exception {
       /* //1.获取该类对应的字节码文件对象
         Class<AnnotationImpl> acls= AnnotationImpl.class;
         //2.获取上边的注解对象
        //实际上就是再内存中生成了一个该注解接口的实现类。
         Annio ann= acls.getAnnotation(Annio.class);
         //调用注解中定义的抽象方法。获取返回值
        String classname = ann.className();
         String meth = ann.methodName();
        System.out.println( classname);
        System.out.println(meth);
        //.加载类进内存
       Class<?> aClass = Class.forName(classname);
         Object instance = aClass.newInstance();
        Method method = aClass.getMethod(meth);
        method.invoke(instance);
*/

        Class<?> aClass = Class.forName("day0918.annotationAppply.AnnotationImpl");
        Annio anno = aClass.getAnnotation(Annio.class);
        String clsN = anno.className();
        final String methodName = anno.methodName();
       Class<?> aClass1 = Class.forName(clsN);
         Object obj = aClass1.newInstance();
        Method method = aClass1.getMethod(methodName);
        method.invoke(obj);

    }
}
