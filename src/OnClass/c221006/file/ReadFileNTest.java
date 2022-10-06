package OnClass.c221006.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileNTest {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        FileReader reader = new FileReader("a_file.txt") { };
        char[] c = new char[num];

        for (int i = 0 ; i < c.length ; i++) {
            c[i] = (char) reader.read();
        }

        for (int i = 0 ; i < c.length ; i++) {
            System.out.println(c[i]);
        }




    }
}
