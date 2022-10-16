package Homework.CodeUp.h221014;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;
        int plus = 0;

        while (sum < limit) {
            plus++;
            sum += plus;

        }

        System.out.println(plus);

    }
}
