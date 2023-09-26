package day0725.exted;

public  class PeopleDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("阿四",30);
        System.out.println();
        t1.teach();
        Student s1=new Student();
        s1.setName("啊大");
        s1.setAge(20);
        s1.study();

    }
}
