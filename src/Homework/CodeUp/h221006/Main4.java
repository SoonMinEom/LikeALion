package Homework.CodeUp.h221006;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch= new char[input.length()];

        for (int i = 0 ; i <input.length() ; i++ ) {
            ch[i] = input.charAt(i);
            System.out.println("'"+ch[i]+"'");
        }

    }
}
