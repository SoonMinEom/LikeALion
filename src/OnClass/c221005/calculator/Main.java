package OnClass.c221005.calculator;

public class Main {
    public static void main(String[] args) {


        NumberGenerator RN = new RandomNumberGenerator();
        NumberGenerator SN = new SpecificNumberGenerator();

        Calculator rcal = new Calculator(RN);
        rcal.plus(5);
        Calculator scal = new Calculator(SN);
        scal.plus(6);

        //오버로딩된 메소드 써보기
        Calculator ocal = new Calculator(50,SN);
        ocal.plus(6);

    }

}
