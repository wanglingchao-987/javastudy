package day0823.Runable;

public class MyRunableDemo {
    public static void main(String[] args) {
        Myrunable my =new Myrunable();
        //
        /*Thread t1=new Thread(my);
        Thread t2=new Thread(my);*/
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");
        t1.start();
        t2.start();



    }
}
