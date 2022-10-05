package OnClass.c221005.calculator;

public class RandomNumberGenerator implements NumberGenerator{
    
    // 인터페이스 상속 1, 숫자 하나를 받아 랜덤 숫자를 리턴
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
