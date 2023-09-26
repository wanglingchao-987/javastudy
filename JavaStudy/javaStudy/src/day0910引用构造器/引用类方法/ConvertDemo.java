package day0910引用构造器.引用类方法;

public class ConvertDemo {
    public static void main(String[] args) {
        //使用lambda表达式
        /*useConverter((String s)->{
            int i = Integer.parseInt(s);
           // return i;

        });*/
        //使用类方法
        useConverter(Integer::parseInt);
        //Lambda表达式被替代的时候，它的形式参数全部传递给静态方法作为参数。


    }
    private static void useConverter(Converter c){
        int num = c.convert("11111");
        System.out.println(num);

    }
}
