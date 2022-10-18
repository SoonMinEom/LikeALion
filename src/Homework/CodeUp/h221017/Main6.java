package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();


        System.out.printf("%.02f MB",w*h*b/(8.0*1024*1024));

        }
    }
