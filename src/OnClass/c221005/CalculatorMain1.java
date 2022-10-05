package OnClass.c221005;

public class CalculatorMain1 {
    public static void main(String[] args) {

        Calculator1 cal = new Calculator1(20,10);
        
        // 생성자에 한 번만 매개변수를 입력하면 됨.
        
        cal.Plus();
        cal.Minus();
        cal.Multiple();
        cal.Divide();
    }
}
