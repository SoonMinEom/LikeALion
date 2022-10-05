package OnClass.c221005.calculator;

public class Calculator{
    NumberGenerator numberGenerator;

    public Calculator (int a, NumberGenerator numberGenerator) {
        System.out.println(a + numberGenerator.generate(a));
    }

}
