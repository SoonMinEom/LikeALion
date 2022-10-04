import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10 };

        System.out.print("금액을 입력하세요 >> ");
        int currentMoney = sc.nextInt();

        for (int i = 0 ; i < money.length ; i++) {
            int temp;
            if( currentMoney >= money[i]) {
                temp = currentMoney / money[i];
                currentMoney = currentMoney - (money[i]*temp);
                System.out.println(money[i] + "원 : " + temp);
            }
        }

    }
}
