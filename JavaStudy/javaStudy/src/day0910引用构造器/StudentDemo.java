package day0910引用构造器;

public class StudentDemo {
    public static void main(String[] args) {
        //useStudentBuilder((String name,int age) -> new Student(name,age));的最直接写法，即引用构造器
        useStudentBuilder(Student::new);

    }
    private  static  void  useStudentBuilder(StudentBuilder sb){
      Student s=  sb.build("王者",20);
        System.out.println(s.getName()+","+s.getAge());

    }
}
