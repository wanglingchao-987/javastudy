package day0910引用构造器.引用类的实例方法;

public class MyStringDemo {
    public static void main(String[] args) {
        //使用Lambda调用方法
        /*usemySubString((String a,int b,int c)->{
           String substring = a.substring(b, c);
           return  substring;


        });*/
        //省略写法
        usemySubString((String a,int b,int c)->a.substring(b, c));
        //引用类的实例方法
        usemySubString(String::substring);
        //表达式被类的实例方法替代的时候，第一个参数作为调用者，
        // 后面的参数全部传递给该方法作为参数
        // Lambda




    }
    private  static  void usemySubString(MyString my){
         String s = my.mySubString("helloword", 2, 5);
        System.out.println(s);

    }
}
