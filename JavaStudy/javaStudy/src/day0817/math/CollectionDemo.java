package day0817.math;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建collection对象
        ArrayList<String> str = new ArrayList<>();
        //添加元素
        str.add("hello");
        str.add("nihao");
        System.out.println(str);
        str.add("111");
        //移除元素
        str.remove("hello");
        //判断集合中是否存在指定元素
        boolean b = str.contains("111");
        System.out.println(b);
        //输出集合的大小
        int s = str.size();
        System.out.println(s);
        //清空集合中的元素
        str.clear();
        //判断集合是否为空
        boolean empty = str.isEmpty();
        System.out.println(empty);
        str.add("hello");
        str.add("nihao");
        str.add("111");
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }


    }
}
