package day0911.函数式接口和Stream流.函数式接口作为方法的返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("ccccc");
        array.add("bb");
        array.add("ddd");
        System.out.println("排序前：" + array);
        Collections.sort(array, getComparator());
        System.out.println("排序后：" + array);
    }

    //匿名内部类

    /*private static Comparator<String> getComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
    }
}*/
    //Lambda表达式的应用
    private static Comparator<String> getComparator() {
        return (s1,s2)->s1.length()-s2.length();
    }
    }