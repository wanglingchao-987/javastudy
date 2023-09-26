package day0817.math;

public class 异常 {

    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3,};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("数组越界");
            e.printStackTrace();
        }
        System.out.println("结束了");
    }
}
