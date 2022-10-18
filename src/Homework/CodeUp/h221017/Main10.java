package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 0; i < n-1 ; i++) {
            a = a * r;
        }

        System.out.println(a);

        }
    }
