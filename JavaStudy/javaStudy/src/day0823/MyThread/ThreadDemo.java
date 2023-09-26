package day0823.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        /*//设置和获取线程名称的第一种方式
        myThread  my1=new myThread();
        myThread  my2=new myThread();
        my1.start();
        my2.start();

        my1.setName("火车");
        my2.setName("火车");*/

        //第二种方式：使用构造方法,并且在myThread中写构造方法
        // public myThread(String name){
        //        super(name);
        //    }
        /*myThread my1=new myThread("火车");
        myThread my2=new myThread("高铁");
        my1.start();
        my2.start();*/
        /*返回当前正在执行的线程对象的引用 static Thread currentThread()
        System.out.println(Thread.currentThread().getName());
*/
        //设置和获取线程优先级的方法：
        /*- public  final int  getPriority():返回此线程的优先级
                - public  final int  getPriority(int newPriority):更改此线程的优先级。
*/

        myThread  my1=new myThread("高铁");
        myThread  my2=new myThread("火车");
        myThread  my3=new myThread("汽车");
        /*my1.setName("高铁");
        my1.setName("火车");*/
        //获取线程优先级
        System.out.println(my1.getPriority());  //5
        System.out.println(my2.getPriority()); //5
        //线程优先级的取值范围[1,10],默认是5.
        my1.setPriority(1);
        my2.setPriority(10);
        my3.setPriority(9);
        my1.start();
        my2.start();
        my3.start();


    }
}
