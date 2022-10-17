package CodingTest.t221017;

public class Rhombuss {

    String letter;

    public Rhombuss(String letter) {
        this.letter = letter+" ";
    }

    public Rhombuss() {
        this.letter = "* ";
    }

    public void PyramidMaker(int level) {
        for (int i = 0 ; i < level ; i++) {
            if ( i < (level/2)+1) {
                for (int j = 0; j < level-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print(this.letter);
                }
            } else {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < level-i; j++) {
                    System.out.print(this.letter);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Rhombuss rt = new Rhombuss("#");
        rt.PyramidMaker(7);

    }
}
