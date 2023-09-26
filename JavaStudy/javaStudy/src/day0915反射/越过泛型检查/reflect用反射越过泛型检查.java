package day0915反射.越过泛型检查;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class reflect用反射越过泛型检查 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array =new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        //array.add("hello"); 会报错
         Class<? extends ArrayList> c = array.getClass();
         Method ad = c.getMethod("add", Object.class);
         ad.invoke(array,"hello");
        System.out.println(array);

    }
}
