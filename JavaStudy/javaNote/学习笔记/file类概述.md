### file类概述

### 1.构造方法

他是文件和目录路径名的抽象表示。对于file而言，其封装的不是一个真正存在的文件，仅仅是一个路径而已。它可以是将来要通过具体的操作把这个路径的内容转化为具体存在的。

1. file(String  pathName):通过将给定的路径名字符串转化为**抽象路径**来创建按新的File实例

2. ```java
   File  file =new File("E:\\java")
   ```

   

3. File(String parent,String  child)

4. File(File parent,String child):

   1. ```java
      package day0820.fileDemo;
      
      import java.io.File;
      
      public class fileDemo {
          public static void main(String[] args) {
              //创建文件的三种方法
              File file =new File("E:\\java");
              System.out.println(file);
              File file1 =new File("E:\\java","fileDemo" );
              System.out.println(file1);
              File file2 =new File(file,"fileTest");
              System.out.println(file2);
      
          }
      }
      
      ```

   ### 2.创建文件：

   ###### public  createNewFile():当该名称的文件不存在，创建一个由该抽象路径命名的新空文件，并返回true,否则相反

   1. ```java
      在E:\javaNote下创建一个文件java.txt
              File f1=new File("E:\\javaNote\\java.txt");
              f1.createNewFile();
      ```

   

   1. 在某个目录下创建一个新的文件
   2. 在某个目录下创建一个多级目录
   3. 在某个目录下创建一个新的文件

   ### 3.创建目录：

   public  boolean mkdir():创建由此抽象路径命名的目录

   1. public  boolean mkdirs():创建由此抽象路径命名的目录,包含任何存在但不需要的父目录。

   2. ```java
      File f1=new File("E:\\javaNote\\java.txt");
              f1.createNewFile();
              //在E:下创建一个目录；
              File f2 =new File("E:\\javaTest");
              f2.mkdir();
              //在E下创建多级目录
              File f3 =new File("E:\\java\\javatest");
              f3.mkdirs();
      ```



4.相关方法

```java
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

```



```java
package day0820.fileDemo;

import java.io.File;

public class DiGuiBianLI {
    public static void main(String[] args) {
        //给定一个路径，通过递归完成该目录下的所有内容
        //并把文件的绝对路径输出
        File f1=new File("E:\\java");
        getAllFilePath(f1);

    }
    public  static void getAllFilePath(File f1){
        //获取目录下的所有文件
         File[] files = f1.listFiles();
         //遍历数组，得到每一个File 对象
        if (files != null) {
            for (File fil:
                 files) {
                //判断该对象是不是目录
                //是。递归调用。
                if(fil.isDirectory()){
                    getAllFilePath(fil);
                }else{
                    //否，获取绝对路径输出在控制台
                    System.out.println(fil.getAbsolutePath());

                }

            }
        }



    }
}

```

