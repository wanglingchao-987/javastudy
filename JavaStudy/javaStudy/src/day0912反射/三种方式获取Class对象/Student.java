package day0912反射.三种方式获取Class对象;

public class Student {
     private String name="王超";
    public Student(String name){
        this.name=name;

    }


    @Override
    public String toString() {
        return "Student{name='\" + name + \"'}";
    }

    void  B(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(){
        System.out.println("构造方法");
    }
    private  void A(){
        System.out.println("你真帅");

    }

}
