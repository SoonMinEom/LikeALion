package Homework.CodeUp.h221011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char result = (char) (input+1) ;

        System.out.println(result);
    }
}
