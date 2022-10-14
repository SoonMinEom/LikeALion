package CodingTest.t221014.insertionSort;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort (int[] arr) {
        int i = 1;
        if (arr[i] < arr[i-1]) {
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        // (2번째 , idx=1, 값 =5)부터 시작해서, 자신의 앞 값과 비교.
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort01 is = new InsertionSort01();

        is.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
