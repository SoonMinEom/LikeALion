package Homework.CodeUp.h221017;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int hex = Integer.parseInt(n,16);

        for (int i = 0; i < 15; i++) {
            System.out.printf("%s*%s=%s\n",n,Integer.toHexString(i+1).toUpperCase(),Integer.toHexString(hex*(i+1)).toUpperCase());
            }
        }
    }
