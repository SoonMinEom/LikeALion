package OnClass.c221011.codingTest;

public class SumofDigit {

    public int solution(int n) {
        int input = n;
        String length = String.valueOf(input);
        int sum = 0;

        for (int i = length.length()-1; i >=0 ; i--) {
            int temp = input / (int)Math.pow(10, i);
            input -= temp*(int)Math.pow(10, i);
            sum += temp;
        }
        return sum;
    }

    public int solution2 (int n) {
        int result = 0 ;

        while (n>0) {
            result += n % 10;
            n = n / 10;
//          System.out.printf("origin:%d result:%d\n", n, result);
        }
        return result;
    }
    public static void main(String[] args) {

        SumofDigit sod = new SumofDigit();
        int result = sod.solution(12345);
        int result2 = sod.solution2(12345);

        System.out.println(result2);

        if (result == 10) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
