package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <=n ; i++) {

            if (i%3 != 0) {
                System.out.print(i+" ");
            }
        }

        }
    }
