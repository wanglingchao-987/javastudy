package day0824.tcp通信;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建stock套接字对象，用于和服务器建立连接，指定服务器户籍和端口号
        Socket socket=new Socket("127.0.0.1",8888);
        //获取文件输出流对象getOutputStream(),
         OutputStream outputStream = socket.getOutputStream();
         //使用文件输出流对象中的方法write()写数据，并转化为字节。
         outputStream.write("你好服务器".getBytes());
         //创建文件输入流对象，用于接收服务器端发送的数据
         InputStream inputStream = socket.getInputStream();
         //创建一个数组，用于存放数据
        byte[] bytes= new byte[1024];
        //调用字节输入流的方法read读取数据，并存放在数组中。
        int len =inputStream.read(bytes);
        //输出读取的内容。
        System.out.println(new String(bytes,0,len));

        socket.close();
    }



}

class Solution {
    public int pivotIndex(int[] nums) {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        lsum[0]=nums[0];
        rsum[0]=nums[nums.length-1];
        for(int i=1;i<=nums.length;i++){
            lsum[i]=lsum[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            rsum[i]=nums[nums.length-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(lsum[i]==rsum[i]) {
                return i;
            }
        }
        return -1;



    }
}



























