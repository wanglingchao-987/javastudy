package day0725.exted;

class  Student extends People{
    public Student(){

    }
    public Student(String name,int age){
        super(name,age);

    }
    public void study(){
        System.out.println("我是学生，我爱学习");

    }
}
