package day0905;

/*import java.util.Scanner;

public class STRING{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        count(w);

    }
    public  static void count(int a){
        if(a < 0) {
            a=QuFan(a); // 实现取反+1逻辑
        }
        int sum=0;
        while(a != 0){
            if ((a&1)==1) {
                sum++;
            }
            a>>>=1;


        }
        System.out.println(sum);

    }
    public   static int QuFan(int a){
        a=-a-1;

        return a;
    }
}*/
import java.util.Scanner;

public class STRING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();

        int count = 0;
        while (num != 0) {
            count += num & 1; // 判断最低位是否为1
            num = num >>> 1; // 无符号右移一位
        }

        System.out.println("二进制表示中1的个数为：" + count);
    }
}