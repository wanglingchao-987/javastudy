package day0909LamBda.无参无返回值抽象方法的练习;

public class EatableImpl implements Eatable{
    @Override
    public void eat() {
        System.out.println("--------------这是一个Lambda的练习，无参无返回值------------");
        System.out.println("一天吃一个苹果");
    }
}
