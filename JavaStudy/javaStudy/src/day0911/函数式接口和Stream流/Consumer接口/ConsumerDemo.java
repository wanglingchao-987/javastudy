package day0911.函数式接口和Stream流.Consumer接口;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*operatorString("林青霞",(String s)->{
            System.out.println(s);
        });*/
        operatorString("林青霞", (String s) -> System.out.println(s),
                (String s) -> System.out.println(new StringBuffer(s).reverse().toString()));
    }

    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }

    //定义一个方法，不同的方式消费
    // 同一个字符串两次
    private static void operatorString(String name, Consumer<String> con, Consumer<String> con1) {
        con.andThen(con1).accept(name);
    }
}
