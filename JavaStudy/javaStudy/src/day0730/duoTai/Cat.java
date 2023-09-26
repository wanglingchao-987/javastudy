package day0730.duoTai;

public class Cat extends Animal {
//private String  sally;
    public Cat(){

    }
    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }


}
