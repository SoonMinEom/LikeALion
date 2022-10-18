package CodingTest.t221018;

public class Square2 {

    void draw(int input) {
        for (int i = 0; i < input; i++) {
            if(i==0 || i == input-1) {
                System.out.println("* ".repeat(input));
            } else {
                System.out.println("* "+"  ".repeat(input-2)+"*");
            }
        }
    }
    public static void main(String[] args) {
        Square2 square2 = new Square2();
        square2.draw(5);
    }
}
