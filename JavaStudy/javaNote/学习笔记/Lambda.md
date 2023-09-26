## Lambda表达式

### 1.理解

**Lambda表达式可以用于实现函数式接口的抽象方法。在这种情况下，Lambda表达式替代了匿名内部类的写法，使得代码更加简洁和易读。**

其体现的是函数式编程思想，“强调做什么，而不是怎么做”

### 2.格式

```java
/*格式：
（形式参数）->{
	代码块
}*/

```

### 3.使用前提

- 有一个接口；
- 接口中有且仅有一个抽象方法

### 4.Lambda表达式省略情况：

1. 参数类型可以省略
2. 如果参数只有一个，可以省略小括号
3. 如果代码块只有一条，可以省略封号和大括号（如果有return,return也需要省略；

### 5.注意事项：

1. 必须得有接口，接口中必须有且仅有一个抽象方法；
2. 必须有上下文环境。

### 6.代码示例

```java
package day0909LamBda.有参数有返回值;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int x,int y)->{
            return  x+y;
        });
    }
    private  static  void useAddable(Addable a){
       int sum= a.add(10,20);
        System.out.println(sum);
    }
}


============================
package day0909LamBda.有参数有返回值;

public interface Addable {
    int add(int x,int y);
}

```

### 7.接口补充

```java
package day0909接口默认方法;

public interface JieKouUse {
    //1.常量
    public static  final  int x=1;
    /*2.接口中的默认方法，即被default修饰的方法
    
    注意：默认方法不强制被重写，但是可以被重写，重写时去掉default.所以如果有多个类实现此接口的方法时，不存在报错问题。
    public default  返回值类型  方法名(参数列表){

    }*/
    public default  void  eat(){
        System.out.println(("这是一个接口中的默认方法，即被default修饰的方法"));
    }
      


    //3.接口中的静态方法：

    /*静态方法只能通过接口名调用。
    public static  返回值类型  方法名(参数列表){ }*/
    public static void show(){
        System.out.println("这是一个接口中的静态方法");
    }
    //4.接口中的私有方法：即是一个共性方法，不需要让别人用。（java9增加的）
    /*定义：
    格式1：private void show(){}
    格式2：private  static void method(){}
    */
   
=========================================


public class JieKouDemo {
    public static void main(String[] args) {
        JieKouUse jk=new JieKou();
        //调用接口中的默认方法
        jk.eat();
        int a=JieKouUse.x;
        //调用接口中的静态方法。
        JieKouUse.show();
    }
}
   



}

```

### 8.lambda方法的引用

#### 8.1引用类方法

```java
//引用f类方法，就是引用类的静态方法
//格式：类名：：静态方法
//范例：Integer::parseInt  将String转化为Int
=============================================
    package day0910引用构造器.引用类方法;

public class ConvertDemo {
    public static void main(String[] args) {
        //使用lambda表达式
        /*useConverter((String s)->{
            int i = Integer.parseInt(s);
           // return i;

        });*/
        //使用类方法
        useConverter(Integer::parseInt);
        //Lambda表达式被替代的时候，它的形式参数全部传递给静态方法作为参数。


    }
    private static void useConverter(Converter c){
        int num = c.convert("11111");
        System.out.println(num);

    }
}
接口：
package day0910引用构造器.引用类方法;

public interface Converter {
    int convert(String s);
}



```

#### 8.2引用对象的实例方法：

相当于引用类中的成员方法

格式：**对象：：成员方法**

```java
package day0910引用构造器.引用方法;

import java.util.Locale;

public class PrintDemo {
    public static void main(String[] args) {
        usePrinter((String s)->{
            String a=s.toUpperCase();
            System.out.println(a);
        });
        //方法引用：引用对象的实例方法。
         PrintString ps = new PrintString();
         usePrinter(ps::printUpper);
         //Lambda表达式被对象的实例代替的时候，他的形式参数全部传递给该方法作为参数

    }
     private  static void usePrinter(Printer p){
        p.PrintUpperCase("abcd");

    }
}

```

#### 3.引用类的实例方法

```java
package day0910引用构造器.引用类的实例方法;

public class  {
    public static void main(String[] args) {
        //使用Lambda调用方法
        /*usemySubString((String a,int b,int c)->{
           String substring = a.substring(b, c);
           return  substring;


        });*/
        //省略写法
        usemySubString((String a,int b,int c)->a.substring(b, c));
        //引用类的实例方法
        usemySubString(String::substring);
        //表达式被类的实例方法替代的时候，第一个参数作为调用者，
        // 后面的参数全部传递给该方法作为参数
        // Lambda




    }
    private  static  void usemySubString(MyString my){
         String s = my.mySubString("helloword", 2, 5);
        System.out.println(s);

    }
}

```



#### 4.引用构造器

## 函数式接口

### 1.定义：

有且仅有一个抽象方法的接口

函数式编程其实就是lambda表达式，所以函数式接口可以适用于Lambda使用的所有接口



确保接口中只有一个方法，Lambda才能顺利推导。

```java
package day0910函数式接口.简单例子;
@FunctionalInterface

public interface MyInterface {
    void show();

}
==========================================
    package day0910函数式接口.简单例子;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my =()-> System.out.println("函数式接口");
        my.show();//触发了Lambda表达式的执行。


    }
}


```

**在函数式接口中使用****lambda**表达式来实现的内容最后需要用接口类型的变量******来接收******。虽然在lambda表达式中我们可以直接提供实现内容，但为了能够调用这个实现，我们仍然需要将其赋值给一个接口类型的变量。这是因为函数式接口是通过接口类型来定义的，只有通过接口类型的变量才能够调用接口中的方法。

### 2函数式接口作为方法的参数

```java
package day0911.函数式接口和Stream流.函数式接口作为方法的返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("ccccc");
        array.add("bb");
        array.add("ddd");
        System.out.println("排序前：" + array);
        Collections.sort(array, getComparator());
        System.out.println("排序后：" + array);
    }

    //匿名内部类

    /*private static Comparator<String> getComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
    }
}*/
    //Lambda表达式的应用
    private static Comparator<String> getComparator() {
        return (s1,s2)->s1.length()-s2.length();
    }
    }
===================================
    排序前：[ccccc, bb, ddd]
排序后：[bb, ddd, ccccc]
```

###   3.supplier接口

```java
package day0911.函数式接口和Stream流.Supplier接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        /*String s=getString(()->{

            return "王者";
        });
        System.out.println(s);

    }*/
        String s=getString(()-> "王者");
        System.out.println(s);
        Integer i=getInteger(()-> 11);
        System.out.println(i);

    }



    private  static String getString(Supplier<String> sup){

        return sup.get();
    }
    private  static Integer getInteger(Supplier<Integer> sup){

        return sup.get();
    }
}



```

应用二

```java
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

```

### 4.Consumer接口

```java
 Consumer<T>
 包含两个方法：
 //void accept(T t) 对给定的参数执行此操作。
 
 
 default Consumer<T> andThen(Consumer<? super T> after)
     ///返回一个组成的 Consumer ，依次执行此操作，然后执行 after操作。 
     
     
   //Consumer<T>接口也叫消费型接口，它消费的数据类型由泛型决定。
     
    
```

## Stream流

### 1.定义

   **Stream流的本质是数据处理管道，用于对集合数据进行流式处理。它提供了一种声明式的方式来操作和处理数据，可以进行筛选、映射、排序、聚合等操作。Stream流并不存储数据，而是对数据进行流式处理的抽象。**

### 2.Stream流的生成方式

*Stream流可以通过多种方式来生成，具体取决于数据源的类型和需求。*

1. #### 集合生成：

    可以通过集合类的 `stream()` 方法来生成一个Stream流。例如：

```java
java



List<String> list = Arrays.asList("a", "b", "c");
   Stream<String> stream = list.stream();
```

2. #### 数组生成：

   可以使用 `Arrays.stream()` 方法来生成一个Stream流。例如：

```java
int[] array = {1, 2, 3};
   IntStream stream = Arrays.stream(array);
```

3. 值生成：可以使用 `Stream.of()` 方法来生成一个包含指定值的Stream流。例如：

```java
java



Stream<String> stream = Stream.of("a", "b", "c");
```

\4. 文件生成：可以使用 `Files.lines()` 方法来生成一个包含文件内容的Stream流。例如：

```java
Stream<String> stream = Files.lines(Paths.get("file.txt"));
```

\5. 生成无限流：可以使用 `Stream.generate()` 或 `Stream.iterate()` 方法来生成无限流。例如：

```java
Stream<Integer> stream = Stream.generate(() -> 1); // 生成全是1的无限流
   Stream<Integer> stream = Stream.iterate(1, n -> n + 1); // 生成自增的无限流
```

这些仅是一些常见的生成方式，还有其他方式可以根据具体需求来生成Stream流。**在生成Stream流后，可以根据需求进行中间操作和终止操作来处理数据。**

### 3.Stream流的中间操作

Stream流的中间操作是在流上执行的操作，用于对流中的元素进行**转换、过滤、映射**等操作，同时保留了流的延迟计算特性。以下是一些常见的中间操作：

1.  `filter(Predicate<T> predicate)` ：根据给定的条件过滤流中的元素，只保留满足条件的元素。

2.  `map(Function<T, R> mapper)` ：将流中的每个元素通过给定的映射函数转换成另一个元素。

3.  `flatMap(Function<T, Stream<R>> mapper)` ：将流中的每个元素通过给定的映射函数转换成一个流，并将所有的流合并成一个流。

4.  `distinct()` ：去除流中的重复元素，保留唯一的元素。

5.  `sorted()` ：对流中的元素进行排序，默认按照自然顺序排序。

6.  `limit(long maxSize)` ：截取流中的前N个元素，返回一个新的流。

7.  `skip(long n)` ：跳过流中的前N个元素，返回一个新的流。

8.  `peek(Consumer<T> action)` ：对流中的每个元素执行给定的操作，返回一个新的流，可用于调试和观察流中的元素。

这些中间操作可以根据需要进行链式调用，形成一个流水线式的操作过程。中间操作不会立即执行，只有在终止操作被调用时才会触发流的处理。

需要注意的是，中间操作是惰性求值的，只有在终止操作被调用时才会触发流的处理。这种特性使得我们可以在处理大量数据时进行优化，只处理需要的部分数据，提高性能和效率。

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SuplierTest {
    public static void main(String[] args) {
        // 定义一个数组，获取数组最大值
        int[] array = {1, 2, 5, 9, 40};
        
        // 转换为Stream流
        List<Integer> numberList = Arrays.stream(array)
                .boxed() // 将int转换为Integer
                .filter(num -> num % 2 == 0) // 过滤偶数
                .map(num -> num * 2) // 将每个元素乘以2
                .collect(Collectors.toList()); // 收集结果为List
        
        System.out.println(numberList); // 输出结果：[4, 8, 80]
    }
}
```

### 4.Stream流的终结操作

Stream流的终止操作是对流进行最终处理并生成结果的操作。它会触发流的处理并产生一个最终的结果，同时结束流的处理过程。以下是一些常见的终止操作：

1.  `collect(Collector<T, A, R> collector)` ：将流中的元素收集到一个可变的结果容器中，例如List、Set、Map等。可以使用Collectors工具类提供的预定义收集器，也可以自定义收集器。

2.  `forEach(Consumer<T> action)` ：对流中的每个元素执行给定的操作，没有返回值。

3.  `count()` ：返回流中的元素个数。

4.  `max(Comparator<T> comparator)` ：返回流中的最大元素，根据给定的比较器进行比较。

5.  `min(Comparator<T> comparator)` ：返回流中的最小元素，根据给定的比较器进行比较。

6.  `findFirst()` ：返回流中的第一个元素。

7.  `findAny()` ：返回流中的任意一个元素。

8.  `reduce(BinaryOperator<T> accumulator)` ：将流中的元素逐个进行累积操作，返回一个Optional对象。

这些终止操作会触发流的处理，并生成一个最终的结果。终止操作是流处理的最后一步，一旦调用了终止操作，就不能再对流进行其他操作。

以下是一个示例，展示如何使用终止操作来处理流并生成结果：


```java



import java.util.Arrays;
import java.util.List;

public class StreamTerminalOperationExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   // 使用终止操作获取流中的元素个数
    long count = numbers.stream()
            .filter(num -> num % 2 == 0)
            .count();
    System.out.println("偶数个数：" + count);

    // 使用终止操作获取流中的最大值
    int max = numbers.stream()
            .max(Integer::compare)
            .orElse(0);
    System.out.println("最大值：" + max);
}
```
}
在上述示例中，我们使用 `count()` 终止操作获取流中偶数的个数，使用 `max()` 终止操作获取流中的最大值。通过终止操作，我们可以对流进行最终的处理，并得到我们所需的结果。





















