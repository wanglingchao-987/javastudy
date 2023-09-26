package day0815;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setName("大猫");
        c.setAge(20);
        System.out.println(c.getAge()+";"+c.getName());
        c.jump();
        c.eat();



    }
}
