package day0914反射.apply;

import java.io.Serializable;

public class Creature <T> implements Serializable {
    private  char gender;
    public double weight;
    private void breath(){
        System.out.println("生物呼吸");
    }
    public  void eat(){
        System.out.println("生物吃东西");
    }
}
