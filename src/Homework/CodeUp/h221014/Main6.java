package Homework.CodeUp.h221014;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int b = 97;

        while( b <= (int) a) {

            System.out.println((char) b);
            b++;

        }

    }
}
