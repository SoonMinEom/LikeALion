package CodingTest.t221018;

public class RecursiveStar {

    void draw(int input) {
        if((input-1) == -1 ){
            return;
        } else {
            draw(input - 1);
            System.out.println("* ".repeat(input));
        }
    }

    public static void main(String[] args) {

        RecursiveStar rs = new RecursiveStar();
        rs.draw(5);
    }
}
