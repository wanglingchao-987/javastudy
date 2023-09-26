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
