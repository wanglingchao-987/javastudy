package day0909LamBda.shengLue;



public class shenglueDemo {
    public static void main(String[] args) {
        useAddable((x,y)->{
            return  x+y;
        });
    }
    private  static  void useAddable(Addable a){
        String sum= a.add("10","20");
        System.out.println(sum);
    }
}
