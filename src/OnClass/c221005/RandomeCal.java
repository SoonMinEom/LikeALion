package OnClass.c221005;

public class RandomeCal implements RandomeNum {
    private int a;

    @Override
    public int ran() {
        return (int)(Math.random()*9);
    }

    public RandomeCal(int a) {
        this.a = a;
    }

    public void plus() {
        System.out.println( a + ran());
    }

    public void Minus() {
        System.out.println( a - ran());
    }

    public void Mul() {
        System.out.println( a + ran());
    }

    public void Div() {
        while(true) {
            int ran = ran();
            if ( ran == 0 ) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            } else {
                double result = (double) a / ran;
                System.out.println(result);
                break;
            }
        }
    }


}
