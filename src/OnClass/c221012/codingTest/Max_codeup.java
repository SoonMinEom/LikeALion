package OnClass.c221012.codingTest;

import java.util.Scanner;

public class Max_codeup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxidx = 0;

        for (int i = 1 ; i <arr.length ; i ++) {
            if(arr[i]>max) {
                max = arr[i];
                maxidx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxidx +1);

    }
}
