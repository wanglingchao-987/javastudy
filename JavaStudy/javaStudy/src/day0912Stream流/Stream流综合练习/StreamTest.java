package day0912Stream流.Stream流综合练习;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("刘德华");
        manList.add("刘伟");
        manList.add("周星驰");
        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("张曼玉");
        womanList.add("林心如");
        womanList.add("周林");
        womanList.add("林黛玉");

         Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
         Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
          Stream<String> stream = Stream.concat(manStream, womanStream);
          stream.map(Actor::new).forEach(p-> System.out.println(p.getName()));



    }
}