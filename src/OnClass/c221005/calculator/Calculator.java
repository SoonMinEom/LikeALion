package OnClass.c221005.calculator;

public class Calculator{

    //인터페이스를 상속한 클래스들을 매개변수로 받아 계산결과 출력 하는 클래스

   private NumberGenerator numberGenerator;

    public Calculator (NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(int a) {
        System.out.println(a + numberGenerator.generate(a));
    }
}
