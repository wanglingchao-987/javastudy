package day0730.duoTai.abstruct;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c=new Cat("大猫",30);
        c.eat();
        c.setName("花猫");
        c.setAge(20);
        System.out.println();

        Animal b=new Animal("大花猫",11) {
            @Override
            public void eat() {

            }
        };





    }
}
