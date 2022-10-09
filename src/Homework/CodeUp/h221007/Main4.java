package Homework.CodeUp.h221007;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String으로 입력 받기
        String s = sc.next();

        //입력 받은 String을 int로 바꾸며 8진수화.
        int octal = Integer.parseInt(s, 8);


        System.out.printf("%d", octal);
    }
}
