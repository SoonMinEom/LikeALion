package CodingTest.t221017;

public class Pyramid {

    String letter;

    public Pyramid(String letter) {
        this.letter = letter;
    }

    public Pyramid() {
        this.letter = "*";
    }

    public void PyramidMaker(int level) {
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

        Pyramid rt = new Pyramid("# ");
        rt.PyramidMaker(10);

    }
}
