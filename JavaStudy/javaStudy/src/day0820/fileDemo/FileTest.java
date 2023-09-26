package day0820.fileDemo;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f1=new File("myfile\\java.txt");
        //创建一个file文件对象
        System.out.println(f1);
        //测试此抽象路径名是否是文件
        System.out.println(f1.isFile());
        //测试此抽象路径名是否是目录
        System.out.println(f1.isDirectory());
        //测试此抽象路径名是否存在
        System.out.println(f1.exists());
        //返回此抽象路径名的绝对路径名字符串
        System.out.println(f1.getAbsolutePath());
        //将此抽象路径名转化为路径名字符串
        System.out.println(f1.getPath());
        //返回此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getName());
        System.out.println("==============================");
        //返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        File f2=new File("E:\\java\\test.txt");
        f2.createNewFile();
        System.out.println("=============以下用来访问文件目录有关方法=======================");
        File f3=new File("E:\\java");

        String[] f1_arr = f3.list();
        if (f1_arr != null) {
            for (String arr:f1_arr
                 ) {
                System.out.println(arr);
            }
        }
        System.out.println("=============================");
        File[] fileArr = f3.listFiles();
        if (fileArr != null) {
            for (File file:
                 fileArr) {
                if ( file.isFile()) {
                    System.out.println(file.getName());
                    System.out.println(file.getAbsolutePath());
                }


            }
        }
        System.out.println("==============删除操作==============");
        //删除以上创建的文件或目录:java.txt
        //javatest
        //test.txt
        System.out.println(f2.delete());   // File f2=new File("E:\\java\\test.txt");

        System.out.println(f1.delete()); //File f1=new File("myfile\\java.txt")


    }
}
