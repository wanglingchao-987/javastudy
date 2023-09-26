package day0817.math;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!"); // 输出：Hello, [用户输入的名字]!
    }
}
