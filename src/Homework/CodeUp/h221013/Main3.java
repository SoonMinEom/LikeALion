package Homework.CodeUp.h221013;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = ( a > b )? a : b;

        System.out.println(c);
    }
}
