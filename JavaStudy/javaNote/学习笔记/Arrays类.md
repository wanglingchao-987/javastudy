Arrays类



与数组有关的类:是与数组有关的类，提供了大量静态方法。

1.导包：java.util.Arrays

2.使用：

​	public   static  String  toString( 数组)：将参数数组变成字符串。

   public     static   void  sort(数组)：给数组元素按照从小到大的顺序排序。

3.将字符串转化为数组：

用toCharArray()将字符串转化为字符数组。

4.举例：

```java
import java.util.Arrays;

public class arrays {
	public static void main(String[] args){
		int[] array={1100,20,3000,203,0};
		
		 String instr=Arrays.toString(array);//将数组转化成为默认的字符串形式，返回值为String.
		 System.out.println(instr);
		Arrays.sort(array);//将数组元素从小到大排列。没有返回值
		 System.out.println(Arrays.toString(array));//
		String  s="abdxkherakkeb";
		char[]  ch=s.toCharArray();//将字符串转化为字符数组。
		for(int i=ch.length-1;i>=0;i--){//倒序遍历
			System.out.println(ch[i]);
		}
}
}

```

