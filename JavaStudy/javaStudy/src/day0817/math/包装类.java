package day0817.math;

public class 包装类 {



        public static void main(String[] args) {
            Integer in1= 1;
            System.out.println(in1);//重写 了to String方法。
            Integer in2=new Integer("1");
            System.out.println(in2);
            Integer in3= Integer.valueOf(1);
            System.out.println(in3);
            int i=in1.intValue();
            System.out.println(i);
            /*
             * 自动装箱
             */
            Integer in4=1;//=Integer in4=new Integer(1);
            //in4是包装类，无法直接参与运算，可自动转化为基本数据类型
            in4=in4+1;


        }

    }


