package Homework.CodeUp.h221018;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length-1 ; i>=0  ; i--) {
            System.out.print(arr[i]+" ");
        }

        }
    }
