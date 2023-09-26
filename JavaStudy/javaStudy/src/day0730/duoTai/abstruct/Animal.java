package day0730.duoTai.abstruct;

public  abstract class Animal {
    public abstract void  eat();
    public Animal(){

    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    private String name;
    private  int  age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public void eat(){

    }*/
}
