package CodingTest.t221013.bubblesort;

// 버블 정렬
// 1. swap 자리바꾸기
// 2. 중첩 for문의 control
// 3. 선형적 ( 비교를 앞으로만 해나감, 왔다갔다 X )


import java.util.Arrays;

public class BubbleSort01 {

    public int[] BubbleSort(int[] arr) {

        for (int i = 0 ; i < arr.length ; i ++) {
            for (int j = i ; j < arr.length-1 ; j++) {
                if( arr[j] > arr[j+1] ) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        BubbleSort01 bs = new BubbleSort01();
        int[] result = bs.BubbleSort(arr);

        System.out.println(Arrays.toString(result));

    }
}
