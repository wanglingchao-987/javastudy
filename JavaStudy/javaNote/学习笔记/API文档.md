### API文档

#### 1.匿名对象

​	就是有右边的对象，没有左边的名字和赋值运算符

​			<u>new   类名称（）；</u>

**注意**	：匿名对象只能**使用一次**。适用于一次性的访问情况。

##### 		（1）匿名对象普通使用

```java
public class testscanner {
	public static void main(String [] args){
        //普通情况正常使用对象
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println(num);
        //匿名对象
        int num=new scanner(System.in).nextInt();
        System.out.println(num);
	}
}
```

##### （2）.将匿名对象作为函数的参数（）

```java
public static void main(String [] args){
		
		method(new Scanner(System.in));
	}
	public static  void method(Scanner s){
		String str=s.next();
		//s.nextInt();
		System.out.println(str);
	}
```

##### （3）.将匿名对象作为函数的返回值。

```java
public static void main(String [] args){
		
		  Scanner sc=method();//创建一个Scanner 类型的数据来接收传回来的值
		  String s=sc.next();
		  System.out.println(s);
	}
	public static    Scanner method(){//创建一个返回值类型为Scanner类的方法
		 return new Scanner(System.in);//返回此匿名对象
        
```

#### 2.random类

- 导包 
- 创建
- 使用

(1).一般的使用

```java
import java.util.Random;

public class rendom {
	public static void main(String []args){
		Random ran=new Random();
		  int s=ran.nextInt(10)+1;
		  System.out.println(s);
	}
 
}
```

(2)猜数小游戏

```java
package mianxiangduixiang;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
public static void main(String [] args){
	//System.out.println();
	Random r=new Random();
	int r1=r.nextInt(100);
	
	 for(int i=0;i<6;i++){
		 System.out.println("请输入一个数：");
		 Scanner sc=new Scanner(System.in);
		 int sc1=sc.nextInt();
		 if (sc1>r1){
			 System.out.println("数字偏大，请重新输入");
		 }
		 else{
			if(sc1<r1) {
				System.out.println("数字偏小，请重新输入");
			}
			else{
				System.out.println("恭喜你猜对了");
				System.out.println("游戏结束");break;
			}
			
		 }
		 //System.out.println("游戏结束");
	 }//System.out.println("游戏结束");
	
}
}

```

#### 3.对象数组：

​	*对象数组就是数组里的每个对象都是类的对象，赋值时先定义对象，然后将对象直接赋值给数组。*

```java
public class Array {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[]  array=new Person[3];
		Person one=new Person("帝力热吧",20);
		Person two=new Person("杨幂",30);
		Person thr=new Person("童瑶",25);
		array[0]=one;//将one当中的地址值赋值到数组的0号元素位置
		array[1]=two;
		array[2]=thr;
		System.out.println(array[0].getName());
	}

}
```



#### 4.数组集合：ArrayList<E\>

- E表示数据元素类型。类型必须是引用类型，并且里面所有元素的类型统一。

- 数组的长度不可变，但是ArrayList的长度可以变化。

- 创建步骤：

  - 导包：import  java.util.ArrayList

  - 创建：ArrayList<类型>  name= new ArrayList<类型>  ();

  - 使用：跟Random类似。调用方法。

    - array.add()

      输出：System.out.println(name);

  **注意：**对于ArrayList来说，直接打印得到的是值，不是地址

   如果内容是空，打印输出为[]

  #### ArrayList 中常用方法：

  - 添加元素：public boolean add（e):
  - 删除元素：public E remove（int index);
  - 获取元素：public E get(int index);
  - 获取集合的尺寸长度：public  int size;返回值为元素个数。

#### ArrayList的应用：

```java
import java.util.ArrayList;//导入包ArrayList

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//创建对象
	
        list.add("杨幂");
		list.add("baby");
		list.add("古力娜扎");
		list.add("kebi");
		System.out.println(list);//输出数组集合
		 boolean access=list.add("鹿晗");
		 System.out.println("元素是否添加成功:"+access);
		  String whoRemove=list.remove(1);
		  System.out.println("谁被删除了:"+whoRemove);
		 String get=list.get(2);
		 System.out.println("取出来的元素是:"+get);
		 int s=list.size();
		 System.out.println("数组集合的长度是:"+s);
		

	}

}

```



```java
package mianxiangduixiang;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListzonghe {
	public static void main(String[] args){
	ArrayList<Integer> a=new ArrayList<Integer>();
	Random r=new Random();//创建随机函数对象
	for(int i=0;i<6;i++){//使用循环方式输出1-33的6个随机数
		int b=r.nextInt(33)+1;
		a.add(b);//将每个随机数添加到数组集合中
	}
	System.out.println("获取到的元素是"+a);
	for (int i = 0; i < a.size(); i++) {
		System.out.println("遍历得到的数是："+a.get(i));//遍历数组集合
	}
	printArrayList(a);
	}
    //创建一个函数，返回值类型为空，参数类型为数组集合，自定义打印输出集合函数
	public static  void printArrayList(ArrayList<Integer> list){
		System.out.print("{");
		for(int i=0;i<list.size();i++){
			if(i<list.size()-1){
				System.out.print(list.get(i)+"@");
			}else{
				System.out.print(list.get(i)+"}");
			}
			
	
		}
	
		}
}

```

