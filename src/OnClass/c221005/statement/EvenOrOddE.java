package OnClass.c221005.statement;

public class EvenOrOddE implements Word{
    @Override
    public String getWord(int a) {
        if(a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
