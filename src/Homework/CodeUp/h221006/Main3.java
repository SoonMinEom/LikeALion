package Homework.CodeUp.h221006;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        String str1 = String.valueOf(input);
        String[] str2 = str1.split("\\.");

        System.out.println(str2[0]);
        System.out.println(str2[1]);

    }
}
