package Homework.CodeUp.h221013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long result = a | b;

        System.out.println(result);
    }
}
