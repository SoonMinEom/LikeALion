package Homework.CodeUp.h221007;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String으로 입력 받기
        String s = sc.next();

        //입력 받은 String을 int로 바꾸며 16진수화.
        int hex = Integer.parseInt(s, 16);


        System.out.printf("%o", hex);
    }
}
