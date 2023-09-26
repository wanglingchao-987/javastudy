package day0820.fileDemo.ioLiu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\java\\java1.txt");
        file.createNewFile();
        /*字节流写数据步骤：

            - 创建字节输出流对象（调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件）
            - 调用字节输出流对象的写数据方法
            - 释放资源*/
        FileOutputStream fos=new FileOutputStream("E:\\java\\java1.txt");
        //将指定的字节写入此文件输出流
        fos.write(30);
        fos.write(22);
        fos.write(-1);
        //释放资源
        fos.close();
        FileInputStream read=new FileInputStream("E:\\java\\java1.txt");
        read.read();
        int by;
        by=read.read();
        while (by!=-1){
            System.out.println((char)by);

        }
        read.close();

    }
}
