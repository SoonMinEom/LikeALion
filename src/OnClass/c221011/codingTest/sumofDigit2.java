package OnClass.c221011.codingTest;

import java.util.Scanner;

public class sumofDigit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0 ;

        if ( n <= 9) {
            result = n;
        }

        while (n > 9) {
            result = 0;
            while (n>0) {
                result += n % 10;
                n = n/10;
            }
            n = result;
        }


        System.out.println(result);

    }
}
