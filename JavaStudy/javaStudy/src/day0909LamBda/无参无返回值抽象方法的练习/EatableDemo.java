package day0909LamBda.无参无返回值抽象方法的练习;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable e = new EatableImpl();

        //匿名内部类
        useEatable(new Eatable() {
                       @Override
                       public void eat() {
                           System.out.println("这是用匿名内部类来实现");
                           System.out.println("一天一苹果，疾病远离我");
                       }
                   }

        );

        useEatable(() ->{
            System.out.println("----主函数中LamBda练习:--");
            System.out.println("一天亿苹果，疾病远离我");
                }

        );

    }

        private static void useEatable (Eatable e){
            e.eat();
        }


}