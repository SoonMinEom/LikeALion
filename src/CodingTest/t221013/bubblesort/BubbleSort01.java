package CodingTest.t221013.bubblesort;

// 버블 정렬
// 1. swap 자리바꾸기
// 2. 중첩 for문의 control
// 3. 선형적 ( 비교를 앞으로만 해나감, 왔다갔다 X )


import java.util.Arrays;

public class BubbleSort01 {

    public int[] BubbleSort(int[] arr) {

        for (int i = 0 ; i < arr.length-1 ; i ++) {
            for (int j = 0 ; j < arr.length-1 ; j++) {
                if( arr[j] > arr[j+1] ) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

        // 강사님 방식. 떨어진 것끼리 교환.
//        for (int i = 0 ; i < arr.length-1 ; i ++) {
//            for (int j = i ; j < arr.length ; j++) {
//                if( arr[i] > arr[j] ) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 11, 9, 28, 2};

        BubbleSort01 bs = new BubbleSort01();
        int[] result = bs.BubbleSort(arr);

        System.out.println(Arrays.toString(result));

    }
}
