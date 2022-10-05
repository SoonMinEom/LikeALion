package OnClass.c221005.calculator;

public class Calculator{

    //인터페이스를 상속한 클래스들을 매개변수로 받아 계산결과 출력 하는 클래스

   private NumberGenerator numberGenerator;
   private int baseNum;

    public Calculator (NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.baseNum = 10;
    }

    //메소드 오버로딩도 해보기!
    public Calculator (int baseNum, NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(int a) {
        System.out.println(baseNum + numberGenerator.generate(a));
    }
}
