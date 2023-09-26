equals方法

1.所有类的最大父类为Object类，自己创建的类会默认继承Object类的方法

所以可以使用Object类的所有方法

2.equals方法：

```java
public  boolean equals(Object obj){
    return(this==obj);
}
//哪个对象调用的this方法，this就是哪个对象，obj为传过来的参数
//参数：Object obj 可以是任意类型的对象
//==比较运算符，返回的是一个布尔值
//基本数据类型。比较的是值，
//引用数据类型，比较的是两个对象的地址值

```

3.equals方法，默认比较两个对象的地址值，没有意义，所以要重写equals方法  