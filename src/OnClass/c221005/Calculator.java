package OnClass.c221005;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    public void Plus (int a, int b) {
        System.out.println(a + b);
    }

    public void Minus (int a, int b) {
        System.out.println(a - b);
    }

    public void Multiple (int a, int b) {
        System.out.println(a * b);
    }

    public void Divide (int a, int b) {
        double result = (double)a / b;
        System.out.println(result);
    }
}
