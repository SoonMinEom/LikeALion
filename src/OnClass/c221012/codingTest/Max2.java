package OnClass.c221012.codingTest;

public class Max2 {
    public static void main(String[] args) {
        //컨트롤+알트+L -> 한꺼번에 정렬!
        //알트+1 -> 옆의 탐색기로 이동
        //원하는 패키지에 두고 알트+인서트 -> 새로운 파일 생성
        int[][] arr = {
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80},
        };

        int max = arr[0][0];
        int[] maxidx = {0,0};

        // i=0인 동안 j=0~8순회 후 i=1로 감.
        for (int i = 0 ; i < 9 ; i ++) {
            for (int j = 0 ; j < 9 ; j ++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxidx[0] = i;
                    maxidx[1] = j;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d",maxidx[0]+1,maxidx[1]+1);


    }
}
