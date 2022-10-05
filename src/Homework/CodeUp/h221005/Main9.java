package Homework.CodeUp.h221005;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] num = input.split("\\-");

        System.out.printf(num[0]+num[1]);
    }
}
