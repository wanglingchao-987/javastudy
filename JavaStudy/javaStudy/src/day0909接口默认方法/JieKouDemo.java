package day0909接口默认方法;

public class JieKouDemo {
    public static void main(String[] args) {
        JieKouUse jk=new JieKou();
        //调用接口中的默认方法
        jk.eat();
        int a=JieKouUse.x;
        //调用接口中的静态方法。
        JieKouUse.show();
    }
}
