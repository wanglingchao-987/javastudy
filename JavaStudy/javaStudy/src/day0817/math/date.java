package day0817.math;

import java.util.Date;

public class date {
    public static void main(String[] args) {
         Date d = new Date();
        System.out.println(d);
        final long time = d.getTime();

        System.out.println(time);
    }
}
