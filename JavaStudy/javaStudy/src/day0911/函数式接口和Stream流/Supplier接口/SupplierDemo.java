package day0911.函数式接口和Stream流.Supplier接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        /*String s=getString(()->{

            return "王者";
        });
        System.out.println(s);

    }*/
        String s=getString(()-> "王者");
        System.out.println(s);
        Integer i=getInteger(()-> 11);
        System.out.println(i);

    }



    private  static String getString(Supplier<String> sup){

        return sup.get();
    }
    private  static Integer getInteger(Supplier<Integer> sup){

        return sup.get();
    }
}
