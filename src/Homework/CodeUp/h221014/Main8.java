package Homework.CodeUp.h221014;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        int sum =0;

        while( b <= a) {

            if ( b % 2 ==0) {
                sum +=b;
            }

            b++;

        }
        System.out.println(sum);

    }
}
