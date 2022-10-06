package OnClass.c221006.file;

import java.io.FileReader;
import java.io.IOException;


public class ReadFileTest {
    public static void main(String[] args) throws IOException {
//        ReadFile readFile = new ReadFile("a_file.txt");
//        try {
//            System.out.println(readFile.readAByte());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        FileReader reader = new FileReader("a_file.txt") { };
        char c = (char) reader.read();

            System.out.println(c);
      




    }
}
