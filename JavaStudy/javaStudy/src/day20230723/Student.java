package day20230723;

 class Studentdemo {
    String  name;
    int   age;
    private int  sallery;
    public void setSallery(int a){
        if (a<=100){
            System.out.println("输入的数字有误");
        }else{
            sallery=a;

        }

    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.printf("我是：%s;年龄：%d;工资：%d￥\n",name,age,sallery);
    }
}
public class  Student{
    public static void main(String[] args) {
        Studentdemo  stu=new  Studentdemo();
        stu.name="wangzhe";
        stu.age=33;
        stu.setSallery(90000);
        stu.show();
    }

}
