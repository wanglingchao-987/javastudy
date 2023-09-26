package day0911.函数式接口和Stream流.Supplier接口;

import java.util.function.Supplier;

public class SuplierTest {
    public static void main(String[] args) {
        //定义一个数组，获取数组最大值
        int [] array;
        array= new int[]{1, 2, 5, 9, 40};
        //找最大值；
        int max = array[0];
        for (int arr:array
             ) {
            if (arr>max) {
                max=arr;
            }

        }
        System.out.println(max);
    }
    private  static  int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
