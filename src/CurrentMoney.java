public class CurrentMoney {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;

        int refund = 27600;

        System.out.printf("5만원권 %d장", refund / curr50000 );
        System.out.printf("  나머지 금액 : %d원\n", refund % curr50000);
        System.out.printf("1만원권 %d장", refund / curr10000);
        System.out.printf("  나머지 금액 : %d원\n", refund % curr10000);
        System.out.printf("5천원권 %d장", refund / curr5000);
        System.out.printf("  나머지 금액 : %d원\n", refund % curr5000);
        System.out.printf("1천원권 %d장", refund / curr1000);
        System.out.printf("  나머지 금액 : %d원\n", refund % curr1000);
        System.out.printf("500원권 %d장", refund / curr500);
        System.out.printf("  나머지 금액 : %d원\n", refund % curr500);
    }
}
