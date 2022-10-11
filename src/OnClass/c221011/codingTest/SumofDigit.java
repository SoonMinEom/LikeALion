package OnClass.c221011.codingTest;

public class SumofDigit {

    public int solution(int n) {
        int input = n;
        String length = String.valueOf(input);
        int sum = 0;

        for (int i = length.length()-1; i >=0 ; i--) {
            int temp = input / (int )Math.pow(10, i);
            input -= temp*(int )Math.pow(10, i);
            sum += temp;
        }
        return sum;
    }
    public static void main(String[] args) {

        SumofDigit sod = new SumofDigit();
        int result = sod.solution(1234);

        if (result == 10) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
