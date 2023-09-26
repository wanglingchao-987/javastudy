package day0909接口默认方法;

public interface JieKouUse {
    //1.常量
    public static  final  int x=1;
    /*2.接口中的默认方法，即被default修饰的方法:  静态方法只能通过接口名调用。
    注意：默认方法不强制被重写，但是可以被重写，重写时去掉default.所以如果有多个类实现此接口的方法时，不存在报错问题。
    public default  返回值类型  方法名(参数列表){

    }*/
    public default  void  eat(){
        System.out.println(("这是一个接口中的默认方法，即被default修饰的方法"));
    }



    //3.接口中的静态方法：

    /*静态方法只能通过接口名调用。
    public static  返回值类型  方法名(参数列表){ }*/
    public static void show(){
        System.out.println("这是一个接口中的静态方法");
    }
    //4.接口中的私有方法：即是一个共性方法，不需要让别人用。（java9增加的）
    /*定义：
    格式1：private void show(){}
    格式2：private  static void method(){}
    */





}
