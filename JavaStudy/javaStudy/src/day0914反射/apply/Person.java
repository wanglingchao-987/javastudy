package day0914反射.apply;

public class Person extends  Creature<String> implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;
    public  Person(){

    }
    private  Person(String name){
        this.name=name;
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void show() {
        System.out.println("这是一个自定义的方法");
    }
    private void run(){
        System.out.println("这是一个随便定义的私有方法");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void method() {
        System.out.println("这是来自自定义接口中方法的实现");

    }

}
