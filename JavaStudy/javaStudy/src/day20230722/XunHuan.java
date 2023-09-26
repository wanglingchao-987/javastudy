package day20230722;

//import java.util.Random;

public class XunHuan {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        arry(arr);


    }

    public static void arry(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");

            } else {
                System.out.print(arr[i] + ", ");
            }


        }


    }


}

