package OnClass.c221005.calculator;

public class Main {
    public static void main(String[] args) {


        NumberGenerator RN = new RandomNumberGenerator();
        NumberGenerator SN = new SpecificNumberGenerator();

        Calculator rcal = new Calculator(5 ,RN);
        Calculator scal = new Calculator(5, SN);

    }

}
