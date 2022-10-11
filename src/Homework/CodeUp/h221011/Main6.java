package Homework.CodeUp.h221011;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.printf("%.1f",(a+b+c)/3.0);
    }
}
