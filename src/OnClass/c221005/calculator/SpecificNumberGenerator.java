package OnClass.c221005.calculator;

public class SpecificNumberGenerator implements NumberGenerator{
    
    // 인터페이스 상속2, 숫자 하나를 받아 특정 숫자를 리턴
    @Override
    public int generate(int num) {
        return 2000*num;
    }
}
