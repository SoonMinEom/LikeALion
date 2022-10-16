package Homework.CodeUp.h221014;

import java.util.Scanner;

public class Main {
    public void repeat() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 0) {

        } else  {
            System.out.println(a);
            repeat();
        }

    }
    public static void main(String[] args) {

        Main main  = new Main();
        main.repeat();

    }
}
