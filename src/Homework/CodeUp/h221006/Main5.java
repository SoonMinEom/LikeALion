package Homework.CodeUp.h221006;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch= new char[input.length()];
        String[] str = new String[input.length()];

        for (int i = 0 ; i <input.length() ; i++ ) {
            ch[i] = input.charAt(i);
            str[i] = String.valueOf(ch[i]);
            System.out.println("["+(int)(Integer.parseInt(str[i])*Math.pow(10,(input.length()-i-1)))+"]");

        }

    }
}
