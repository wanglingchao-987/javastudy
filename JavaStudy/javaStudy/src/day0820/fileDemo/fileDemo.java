package day0820.fileDemo;

import java.io.File;
import java.io.IOException;

public class fileDemo {
    public static void main(String[] args) throws IOException {
        //创建文件的三种方法
        ///File file =new File("E:\\java");
        //System.out.println(file);
        /*File file1 =new File("E:\\java","fileDemo" );
        System.out.println(file1);
        File file2 =new File(file,"fileTest");
        System.out.println(file2);*/
         //在E:\javaNote下创建一个文件java.txt
        File f1=new File("E:\\javaNote\\java.txt");
        f1.createNewFile();
        //在E:下创建一个目录；
        File f2 =new File("E:\\javaTest");
        f2.mkdir();
        //在E下创建多级目录
        File f3 =new File("E:\\java\\javatest");
        f3.mkdirs();


    }
}
