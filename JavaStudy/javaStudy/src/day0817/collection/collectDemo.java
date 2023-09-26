package day0817.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collectDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("张四", 200);
        Student s3 = new Student("张五", 201);
        //创建collection集合对象
        Collection<Student> s = new ArrayList<Student>();
        //将学生对象添加进集合
        s.add(s1);
        s.add(s2);
        s.add(s3);
        //迭代器方式遍历集合
         Iterator<Student> it = s.iterator();
         while(it.hasNext()){
            Student a= it.next();
             System.out.println(a.getName()+":"+a.getAge());
         }
        System.out.println("===============以下内容为List集合的基本操作====================");
         //创建list集合对象
         List<Student> l= new ArrayList<>();
         l.add(s1);
        l.add(s2);
        l.add(s3);
        l.iterator();


    }
}
