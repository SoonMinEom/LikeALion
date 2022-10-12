package OnClass.c221012.codingTest;

public class Max {

// 최대 값을 구하기 위해선 입력된 모든 값을 최소한 한 번씩은 확인 해야함.
// -> O(N)속도: 9의 속도를 지님 개수가 9개이기 때문. 즉, 갯수만큼의 속도를 지님.

// Map map = new HashMap(); -> O(1) 속도, 가장빠른 계산 속도. 즉, 갯수와 상관 없이 한번에 접근
// 알고리즘 짤 때는 O(1) 속도에 근접할 수 있도록 짜는 것이 목표.

    public int getMax(int[] arr) {

        int max = 0;
        // int max = arr[0]; -> 배열의 값이 음수여도 문제 없음!!

        for (int i = 0 ; i <arr.length ; i ++) {
      //for (int i = 1 ; i <arr.length ; i ++)
      //arr[0]이 초기화 값이니, arr[1]부터 루프하면 됨.
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        Max max = new Max();
        int result = max.getMax(arr);

        if (result ==85) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }

// 이 로직에서 발생할 수 있는 문제점과 개선점.
// 1. 배열의 값이 모두 음수일 경우 : max 초기화 값이 0 이라 결과도 0이 나옴.
// -> 초기화 값을 arr[0]으로 하면 된다.
// -> 초기화 값이 arr[0]이니까, 루프는 arr[1]부터 하면 됨. (비교값이 많아질 수록 효율 급상승)


    }
}
