package day0726;

public class AnimalDemo {
    public static void main(String[] args) {
        AnmOperate ao=new AnmOperate();

        Cat c=new Cat();
        ao.useAnminal(c);
        System.out.println(ao);
    }
}
