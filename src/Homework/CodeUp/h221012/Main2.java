package Homework.CodeUp.h221012;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (a != b) {
            System.out.println(1);
        }else {
            System.out.println(0);

            sc.close();
        }
    }
}
