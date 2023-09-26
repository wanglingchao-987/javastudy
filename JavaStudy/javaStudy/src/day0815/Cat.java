package day0815;



public class Cat extends animal implements Jump {
    public String name;
    public  int age;

    @Override
    public void eat() {
        System.out.println("我实现了抽象类中的抽象方法");
        System.out.println("猫吃什么啊");
    }

    @Override
    public void jump() {
        System.out.println("我实现了接口中的抽象方法,");
        System.out.println("猫蹦跶蹦跶跳");

    }

    public Cat() {
    }


    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
    }

}
