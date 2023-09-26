## api基本类

### System类

1. 属于java.long.System类

2. 主要方法：

   - ```java
     //返回以毫秒为单位的当前时间
         public static  long currentTimeMillis():
     //将数组中指定的数据拷贝到另外一个人数组中
     - public static void arraycopy (object src（原数组）, int srcPos（起始位置）,Object  dest（目标数组） ,int destPos（起始位置),int Length（长度）); 
     
     ```

### StringBulider类

1. 字符串的底层是一个被final修饰的数组，不能改变。是一个常量

2. 进行字符串的相加，内存中会有多个字符串，占用空间多，效率低下。

3. StringBulider**:字符串缓冲区，可以提高字符串的操作效率。**（可看作是长度可变的字符串）

4. 底层：在内存中始终是一个数组，占用的空间少，效率高，如果超出了容量，会自动扩容。

   ```java
   //底层逻辑
   byte[]  value =new byte[16];
   ```

5. 构造方法：

   - ```java
     //构造一个不带任何字符的字符串生成器，其初始容量为指定的字符串内容
     StringBulider(){
         ///
     }
     //构造一个生成器，并初始化
     StringBulider(String str)
         
         
     ```

6. 具体应用

7. ```java
   package StringBulider;
   
   public class DemStringBulider {
   
   	
   	public static void main(String[] args) {
   		
   		/*
   		 * 使用构造方法
   		 */
   		StringBuilder bul=new StringBuilder();
   		System.out.println(bul);
   		StringBuilder bul1=new StringBuilder("sba");
   		System.out.println(bul1);
   		
   		/*
   		 * 使用StringBuild方法,返回值是一个对象；
   		 */
   		System.out.println("===========");
   		StringBuilder bu=new StringBuilder();
   		bu.append(123);
   		bu.append(45);
   		bu.append("上");
   		bu.append("山打");
   		bu.append("laohu");
   		System.out.println(bu);
   		//或者
   		bu.append(123).append(45).append("上").append("山打").append("老虎");
   		System.out.println(bu);
   		
   		
   		/*
   		 * 
   		 * StringBulider和String可以相互转化
   		 * String -->StringBulider可以使用StringBulider的构造方法
   		 * StringBulider-->String：可以使用StringBulider中的toString方法，
   		 * public  String 可以将当前StringBulider对象转化为String对象；
   		 */
   		System.out.println("===========");
   		String str="hello";
   		System.out.println(str);
   		 StringBuilder b=new StringBuilder(str);
   		 //往里添加一些数据
   		 b.append("nihao ");
   		 System.out.println(b);
   		 String s=b.toString();
   		 System.out.println(s);
   		
   		
   	
   		 
   	}
   
   }
   
   
   ```

   

