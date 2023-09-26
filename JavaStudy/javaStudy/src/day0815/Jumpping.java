package day0815;

public interface Jumpping {
    public  abstract  void  jump();
    public  abstract  void  eat();
    default  void  play(){
        System.out.println("动物玩什么");
    }
    static void  drink(){
        System.out.println("喝什么");
    }
    int  c=0;
}
