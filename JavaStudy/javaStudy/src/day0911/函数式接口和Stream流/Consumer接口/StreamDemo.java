package day0911.函数式接口和Stream流.Consumer接口;

import java.util.ArrayList;
//任务：
/*创建一个集合
把集合中所有以张开头的元素存储到新的集合
把“张”开头的集合中长度为三的元素存储再一个新的集合。*/
//把“张”开头的集合中长度为三的元素存储再一个新的集合。
//把“张”开头的集合中长度为三的元素存储再一个新的集合。

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖蓝");
        list.add("张无忌");
        list.add("张营");
        //把集合中所有以张开头的元素存储到新的集合
        ArrayList<String> zhanglist = new ArrayList<>();
        for (String zhang : list
        ) {
            if (zhang.startsWith("张")) {
                zhanglist.add(zhang);

            }

        }
        System.out.println(zhanglist);
        //把“张”开头的集合中长度为三的元素存储再一个新的集合。
        ArrayList<String> threeList = new ArrayList<>();
        for (String s : zhanglist
        ) {
            if (s.length() == 3) {
                threeList.add(s);

            }

        }
        System.out.println(threeList);
        //遍历新得到的集合
        for (String a : threeList
        ) {
            System.out.println(a);

        }
        System.out.println("--------------更优雅的方式实现上述------------------");
        //使用Stream流来改写。
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
