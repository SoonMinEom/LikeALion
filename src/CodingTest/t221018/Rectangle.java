package CodingTest.t221018;

public class Rectangle {
    void draw(int x, int y) {
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < x; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();

        for (int i = 0; i < y; i++) {
            System.out.println("*  ".repeat(x));
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.draw(3, 5);
    }
}
