package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 0; i < n-1 ; i++) {
            a = a + d;
        }

        System.out.println(a);

        }
    }
