package Homework.CodeUp.h221006;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split("\\:");

        System.out.println(Integer.parseInt(str[1]));

    }
}
