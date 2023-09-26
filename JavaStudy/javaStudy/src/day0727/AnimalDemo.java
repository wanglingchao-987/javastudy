package day0727;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a =new Cat();
        a.eat();
        //a.playGame();不能直接调用子类特有的方法。如果要调用，就必须强制下转型。
        Cat c=(Cat) a;
        c.eat();
        c.playGame();

    }
}
