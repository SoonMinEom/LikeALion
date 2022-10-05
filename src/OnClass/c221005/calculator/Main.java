package OnClass.c221005.calculator;

public class Main {
    public static void main(String[] args) {


        NumberGenerator RN = new RandomNumberGenerator();
        NumberGenerator SN = new SpecificNumberGenerator();

        Calculator rcal = new Calculator(RN);
        rcal.plus(5);
        Calculator scal = new Calculator(SN);
        scal.plus(6);

    }

}
