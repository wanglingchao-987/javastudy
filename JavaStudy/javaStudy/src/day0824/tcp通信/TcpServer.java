package day0824.tcp通信;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    /*//接受客户端的请求，读取客户端送发的数据，给客户端回写数据
     //表示服务器的类：java.net.ServerSocket:此类实现服务器套接字。
    //构造方法：
        //ServerSocket(int port):创建绑定到特定端口号的服务器套接字
        //服务器必须知道是哪个客户端请求的服务器，所以用accept()方法来获取请求的客户端对象 Socket.
        //成员方法：Socket accpet()方法，侦听并接受套接字的连接。

    //服务器的实现步骤：
    创建服务器ServerSocket对象则系统指定的端口号。
    使用serverSocket对象中的方法accept.获取请求的客户端对象Socket。
    使用socket对象中的方法getInputStream()获取网络字节输入流InputStream对象。
    使用网络字节输入流inputstream对象中的方法read，读取客户端发送的数据。
    使用socket中的方法Output stream获取网络字节输出流OutputStream对象.
    使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据。
    ServerSocket socket=new ServerSocket(8888);*/


    //成员方法：Socket  accept().
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象则系统指定的端口号.
        ServerSocket server=new ServerSocket(8888);
        //调用ServerSocket的accept()方法，等待客户端连接，并返回一个Socket对象。
         Socket socket = server.accept();
        //通过Socket对象获取输入流，用于接收客户端发送的数据。
        InputStream inputStream = socket.getInputStream();
        //创建一个byte数组用于存储接收到的数据。
         byte[] bytes= new byte[1024];
         // 调用输入流的read()方法，将接收到的数据存储到byte数组中，并返回实际读取的字节数。
         int len =inputStream.read(bytes);
        //将byte数组转换为字符串，并打印输出。
        System.out.println(new String(bytes,0,len));
        //通过Socket对象获取输出流，用于向客户端发送数据
        OutputStream os= socket.getOutputStream();
        //. 调用输出流的write()方法，将确认消息转换为字节数组并发送给客户端。
        os.write("收到谢谢".getBytes());
        socket.close();
        server.close();
    }

}
