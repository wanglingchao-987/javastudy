### String类

***一：字符串的特点***

1. java.long.String类代表字符串

2. 程序当中所有的双引号字符串，都是String类的对象

3. 字符串创建之后，内容永不可变

   - 正因为字符串不可改变，所以字符串可以共享使用

4. 字符串效果上相当于char[]字符数组，但是底层原理是byte字节数组。

   **二：字符串三种构造方法：**

   1. public String（）；创建一个空白字符串，不含有任何内容

   2. public String(char[]  array) :根据字符数组的内容，来创建对应的字符串

   3. public String(byte[]  array)：根据字节数组的内容，来创建对应的字符串

   4. 直接创建字符串

      - String  str="hello"; //右边直接用双引号。

      对于直接创建的字符串，其放在字符串常量池中；new出来的没有在常量池中。

      对于引用类型来说，==是进行地址值的比较。

      ```java
      public static void main(String[] args) {
      		 TODO Auto-generated method stub
      			
      			/*char[] charr={'a','b','c'};
      			String  s1=new String(charr);
      			System.out.println(s1);*/
      		/*String str1="abc";
      		String str2="abc";
      		char[] str3={'a','b','c'};
      		String str4=new String(str3);
      ```

      

 三**：引用类型字符串比较：**

1. ​	public   boolean equals(Object  obj);参数可以是任何对象，只有参数是一个字符串，并且内容相同的才能给true;否则返回false;

   - 任何对象都能用object进行接收。

   - 比较值    str1.equals(str2)  或者str2.equal(str1),对称，值一样。

   - 当“hello”.equals(str1)与str1.equals("hello")一样，但是推荐使用**前者**。*（防止出现空指针异常）*

   2.public boolean equalsIgnoreCase(String str);   //**忽略大小写，进行内容比较**

   ```java
   String str1="abc";
   		String str2="abc";
   		char[] str3={'a','b','c'};
   		String str4=new String(str3);
   		System.out.println(str1==str2);
   		boolean t=str1.equals(str2);
   		boolean t2=str1.equals(str4);
   		System.out.println(t);
   		//System.out.println(t1);
   		System.out.println(t2);
   ```

   

   #### 四.String中与获取有关的方法：

   1. 获取字符串的含有的字符个数：拿到字符串长度。

      1. public int  length();

      2.public String  concat(String str),合并两个字符串。

      3.public char  charAt(int index):获取指定位置的单个字符。

      4.public  int  indexOf(String str):查找参数字符串在本字符串中首次出现的索引位置。如果没有返回-1.

      ```java
              String str="hello";
      		String str1="World";
      		//String  str3=str1+str;
      		String str2=str.concat(str1);
      		System.out.println(str2);
      		int i=str.length();
      		System.out.println(i);
      		int a=str2.indexOf(str);
      		System.out.println(a);
      		char b=str.charAt(2);
      	System.out.println(b);
      ```
   
   

#### 五：字符串的截取

1. public  String substring(int index):截取从索引位置开始，一直到末尾，返回新字符串。
2. public  String substring(int begin,int end),包含begin,不包含end;

**六：与转换相关的方法：**

1. public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值。
2. public byte[] getBytes();获得当前字符串底层的字节数组。
3. public String replace(CharSeqence  oldString ,CharSeqence  newString):将旧字符串用新的字符串替换，返回新字符串。

#### **七：字符串的分割**：

public  String[]  splite(String  regular):按照参数规则，将字符串分割成若干部分。

注意：如果按照.进行分割，必须写成\\\\\.



