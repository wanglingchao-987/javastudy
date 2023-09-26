package day0730.duoTai;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a= new Cat();
        a.eat();
        a.setName("花猫");
        a.setAge(22);
        System.out.println(a.getName()+","+a.getAge());
        a=new Cat("狸猫",6);
       // System.out.println();
        System.out.println(a.getName()+","+a.getAge());
    }

}
