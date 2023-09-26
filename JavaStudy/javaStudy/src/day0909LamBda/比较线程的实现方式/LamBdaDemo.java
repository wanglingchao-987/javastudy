package day0909LamBda.比较线程的实现方式;

public class LamBdaDemo {
    public static void main(String[] args) {
        /*//方式一
        myRunable my =new myRunable();
        Thread t=new Thread(my);
        t.start();
        //方式二：匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/
        //方式三
        new Thread( ()->{
            System.out.println("多线程启动了");
        }

        ).start();
        //对上述的详细写法
        Thread th=new Thread(
                ()->{
                    System.out.println("又一个多线程启动了");
                }
        );
        th.start();

    }
}
