package day0815;

public class jumpTest {
    public static void main(String[] args) {
        Jumpping j=new JumppingImpl("狗",22);

        j.jump();
        j.eat();
        j.play();
        int a=JumppingImpl.c;
        Jumpping.drink();
        JumppingImpl q =   new JumppingImpl("mao",00);
        System.out.println(q.getName()+","+q.getAge());

    }


}
