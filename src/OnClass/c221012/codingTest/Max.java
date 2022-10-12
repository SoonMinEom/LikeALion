package OnClass.c221012.codingTest;

public class Max {

// 최대 값을 구하기 위해선 입력된 모든 값을 최소한 한 번씩은 확인 해야함.
// -> O(N)속도: 9의 속도를 지님 개수가 9개이기 때문. 즉, 갯수만큼의 속도를 지님.

// Map map = new HashMap(); -> O(1) 속도, 가장빠른 계산 속도. 즉, 갯수와 상관 없이 한번에 접근
// 알고리즘 짤 때는 O(1) 속도에 근접할 수 있도록 짜는 것이 목표.

    public int getMax(int[] arr) {

        int max = 0;

        for (int i = 0 ; i <arr.length ; i ++) {
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

    }
}
