package Homework.CodeUp.h221018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer, Integer> arr = new HashMap<>();

        for (int i = 0; i < 23; i++) {
            arr.put(i+1,0);
        }

        for (int i = 0; i < num; i++) {
            int ran = sc.nextInt();
            if(arr.get(ran) != 0) {
                arr.put(ran,arr.get(ran)+1);
            } else {
                arr.put(ran,1);
            }
        }

        for (Integer integer : arr.keySet()) {
            System.out.printf("%d ",arr.get(integer));
        }

        }
    }
