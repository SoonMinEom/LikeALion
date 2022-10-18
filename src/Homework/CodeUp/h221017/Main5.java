package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        System.out.printf("%.01f MB",h*b*c*s/(8.0*1024*1024));

        }
    }
