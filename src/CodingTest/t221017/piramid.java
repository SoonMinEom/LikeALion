package CodingTest.t221017;

public class piramid {

    String letter;

    public piramid(String letter) {
        this.letter = letter;
    }

    public piramid() {
        this.letter = "*";
    }

    public void RightTriangleMaker(int level) {
        for (int i = 0 ; i < level ; i++) {
            for (int j =0; j <level+1 ; j++) {
                if (j < level-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(this.letter);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        piramid rt = new piramid("* ");
        rt.RightTriangleMaker(10);

    }
}
