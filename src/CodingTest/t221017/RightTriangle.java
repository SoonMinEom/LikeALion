package CodingTest.t221017;

public class RightTriangle {

    String letter;

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public RightTriangle() {
        this.letter = "*";
    }

    public void RightTriangleMaker(int level) {
        for (int i = 0 ; i < level ; i++) {
            for (int j =0; j <i+1 ; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle("#");
        rt.RightTriangleMaker(10);

    }
}
