package Homework.CodeUp.h221005;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] date = input.split("\\.");
        int a = Integer.parseInt(date[0]);
        int b = Integer.parseInt(date[1]);
        int c = Integer.parseInt(date[2]);

        System.out.printf("%04d.%02d.%02d", a, b, c);
    }
}
