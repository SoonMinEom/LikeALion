package Homework.CodeUp.h221018;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 1;

        while (true) {
            if(day%a==0 && day%b==0 && day%c==0) {
                System.out.println(day);
                break;
            }
            day++;
        }
    }
}
