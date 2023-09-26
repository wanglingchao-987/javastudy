## IO流

### 1.IO流介绍：

io：表示的是数据的输入和输出。

流表示的是数据在设备间的传输。流的本质是数据传输。

IO流就是处理数据在设备之间的传输问题。

常见的应用：文件复制、文件上传、文件下载

### 2。IO流的分类

1. 按照数据的流向：
   1. 输入流：读数据
   2. 输出流：写数据
2. 按照数据类型
   1. 字节流：字节输入流 ----字节输出流
   2. 字符流：字符输入流 ----字符输出流

### 3.IO流的使用场景

1. 纯文本：优先使用字符流
2. 图片、视频、音频等二进制文件：优先使用字节流
3. 如果不确定文件类型，优先使用字节流，字节流是万能的流。

4.字节流写数据步骤：

- 创建字节输出流对象（调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件）

- 调用字节输出流对象的写数据方法

- 释放资源

- ```java
  package day0820.fileDemo.ioLiu;
  
  import java.io.File;
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
          //释放资源
          fos.close();
      }
  }
  
  ```

### 4.字节流写数据的三种方式



