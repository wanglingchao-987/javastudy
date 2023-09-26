package day0730.duoTai.abstruct;

public class Cat extends Animal{
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
