package CodingTest.t221018;

public class Square {

    void draw(int input) {
        for (int i = 0; i < input ; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Square square = new Square();
        square.draw(5);
    }
}
