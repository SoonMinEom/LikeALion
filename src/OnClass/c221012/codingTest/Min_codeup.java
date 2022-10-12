package OnClass.c221012.codingTest;

import java.util.Scanner;

public class Min_codeup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int minidx = 0;

        for (int i = 1 ; i <arr.length ; i ++) {
            if(arr[i]<min) {
                min = arr[i];
                minidx = i;
            }
        }

        System.out.println(min);
        System.out.println(minidx +1);

    }
}
