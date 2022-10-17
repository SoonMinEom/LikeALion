package CodingTest.t221017;

public class RightTriangle {

    public void RightTriangleMaker(int level) {
        for (int i = 0 ; i < level ; i++) {
            for (int j =0; j <i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();
        rt.RightTriangleMaker(10);

    }
}
