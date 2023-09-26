package day0815.InnerLei;

public class InnerLei {
    public static void main(String[] args) {
        Out o =new Out();
        o.method();
        System.out.println("----------------下面是第二种访问内部类方式");
        Out.in in = new Out().new in();
        in.show();
    }
}
