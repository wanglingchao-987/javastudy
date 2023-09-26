## java中的修饰符

1. **public**：对所有类可见，公共的

2. **private**：私有的，在同一类中可见，修饰变量和方法。

3. **default**:默认的，对于同一个包可使用。接口中的变量默认的权限是public static final,

   ​			接口中的方法默认权限是public.

4. **protected**:受保护的访问修饰符

   > protected 需要从以下两个点来分析说明：

   - **子类与基类在同一包中**：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；

   - **子类与基类不在同一包中**：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。

   ​       protected 可以修饰数据成员，构造方法，方法成员，**不能修饰类（内部类除外）**。

   ​     接口及接口的成员变量和成员方法不能声明为 protected。 

5.具体的访问控制权限如下表：

![image-20201011180044482](C:\Users\wlc\AppData\Roaming\Typora\typora-user-images\image-20201011180044482.png)

*以private为例，代码如下*

```java
class xiushitest{
	private String  name;
	private int age;
	 public  void call(){
		 System.out.println("姓名："+ name+"\n年龄："+age);
	}
	 public void setAge(int age){
		 this.age=age;
	 }
	 public int  getAge(){
		 return this.age;
	 }
	 
	 
	 /*public void setName( String name){
		 this.name=name;
	 }
	 public String  getName(){
		 return this.name;
	 }*/
	 public void name(String name){
		 this.name=name;
	 }
}
public class xiushi {
	public static void main(String[] args){
	xiushitest pri=new xiushitest();
	pri.setAge(200);
	//pri.setName("王者");
	pri.name("王者");
	pri.call();
	
	}

}

```

