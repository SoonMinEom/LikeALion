public class CurrentMoney {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;

        int refund = 25000;

        System.out.printf("5만원권 %d장\n", refund / curr50000);
        System.out.printf("1만원권 %d장\n", refund / curr10000);
        System.out.printf("5천원권 %d장\n", refund / curr5000);
        System.out.printf("1천원권 %d장\n", refund / curr1000);
    }
}
