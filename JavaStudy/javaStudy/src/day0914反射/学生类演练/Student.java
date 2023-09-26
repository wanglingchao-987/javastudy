package day0914反射.学生类演练;

public class Student {
    public  String  id;
    public  int    gz;
    private String name;
    private  int age;
    public Student(){
       // System.out.println("我是无参构造方法");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        //return "Student [name="+name+","+age="+age"+"]";
        //return "Student [name="+ name + ", age=" + age + "]";
        return "Student [name="+name+",age="+age+",id="+id+",gz="+gz+"]";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name){
        this.name=name;

    }

    public  void eat(){
        System.out.println("chichichi ");

    }
    private void  run(){
        System.out.println("paoapoapao");
    }
}
