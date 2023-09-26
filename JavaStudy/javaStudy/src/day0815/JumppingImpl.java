package day0815;

public class JumppingImpl implements Jumpping {
    @Override
    public void jump() {
        System.out.println("这个方法重写了接口中的抽象方法jump");
    }

    @Override
    public void eat() {
        System.out.println("这个方法重写了接口中的抽象方法eat");
    }
    private  String name;
    private  int  age;
    public JumppingImpl(){

    }

    @Override
    public void play() {
        System.out.println("我重写了接口中的默认方法");
    }

    public JumppingImpl(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  int getAge(){
        return  age;
    }
    public void  setAge(int age){
        this.age=age;
    }
}
