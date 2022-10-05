package OnClass.c221005;

public class RandomCal implements RandomNum {
    private int a;
    private int ranNum;

    @Override
    public int ran() {
        return (int)(Math.random()*9);
    }

    public RandomCal(int a) {
        this.a = a;
        this.ranNum = ran();
        System.out.println("연산 수 : " + ranNum);
    }

    public void plus() {
        System.out.println( a + ranNum);
    }

    public void Minus() {
        System.out.println( a - ranNum);
    }

    public void Mul() {
        System.out.println( a * ranNum);
    }

    public void Div() {
        while(true) {
            if ( ranNum == 0 ) {
                System.out.println("0으로 나눌 수 없습니다.");
                ranNum = ran();
                System.out.println("새로운 나누는 수 : " + ranNum);
                continue;
            } else {
                double result = (double) a / ranNum;
                System.out.println(result);
                break;
            }
        }
    }


}
