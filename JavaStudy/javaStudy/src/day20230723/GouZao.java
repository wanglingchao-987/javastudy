package day20230723;

 class GouZaoDemo {
     //构造方法
    private  String name;
    private  int  age;
    //无参构造方法
    public GouZaoDemo(){

    }
    //带参构造方法
    public GouZaoDemo(String name,int age){
        this.age=age;
        this.name=name;

    }
    //成员方法
    public void setName(String na){
        name=na;
    }

    public String getName() {
        return name;
    }
    public void  setAge(int ag){
        age=ag;
    }
    public int getAge(){
        return age;
    }
    public  void show(){
        System.out.println(name+","+age);

    }
}
public class  GouZao{
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXXX()赋值；
        GouZaoDemo gz=new  GouZaoDemo();
        gz.setName("王者");
        gz.setAge(20);
        gz.show();
        //使用带参数的构造方法创建带有属性值的对象
        GouZaoDemo gz1=new GouZaoDemo("阿四",30);
        gz1.show();



    }

}

