package OnClass.c221005;

public class Calculator1 {
    private int a;
    private int b;

    // 생성자 추가 단축키 Alt + insert
    // 생성자 추가를 통해, 각 메소드 마다 매개변수를 입력할 필요가 없어짐.

    public Calculator1 (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void Plus () {
        System.out.println(a + b);
    }

    public void Minus () {
        System.out.println(a - b);
    }

    public void Multiple () {
        System.out.println(a * b);
    }

    public void Divide () {
        double result = (double)a / b;
        System.out.println(result);
    }
}
