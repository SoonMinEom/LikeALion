package CodingTest.t221014.insertionSort;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//            for ( int j = i+1 ; j >0 ; j-- ) {
//                if (arr[j] < arr [j-1]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
            int j = i + 1;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
        return arr;
    }

        public static void main (String[]args){

            // (2번째 , idx=1, 값 =5)부터 시작해서, 자신의 앞 값과 비교.
            int[] arr = {8, 5, 6, 2, 4};

            InsertionSort01 is = new InsertionSort01();

            is.sort(arr);

            System.out.println(Arrays.toString(arr));

        }
    }

