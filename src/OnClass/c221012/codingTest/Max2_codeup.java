package OnClass.c221012.codingTest;

import java.util.Scanner;

public class Max2_codeup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0 ; i < 9 ; i ++) {
            for (int j = 0 ; j < 9 ; j ++ ) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int[] idx = {0, 0};

        for (int i = 0 ; i < 9 ; i ++) {
            for (int j = 0 ; j < 9 ; j ++ ) {
               if(arr[i][j] >max) {
                   max = arr[i][j];
                   idx[0] = i;
                   idx[1] = j;
               }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d",idx[0]+1,idx[1]+1);
    }
}
