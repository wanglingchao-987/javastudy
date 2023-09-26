package day0815.InnerLei;

public class Out {
    private int age=20;
    public  class in{
        public  void show(){
            System.out.println("我今年"+age+"岁");
        }

    }
    public  void  method(){
        in  i=new in();
        i.show();
    }
}


