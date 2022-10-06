package Homework.CodeUp.h221006;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split("\\.");
        int[] num = new int[str.length];

        for (int i = 0 ; i < str.length ; i ++) {
            num[i] = Integer.parseInt(str[i]);
        }

        System.out.printf("%02d-%02d-%04d", num[2], num[1], num[0]);

    }
}
