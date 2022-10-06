package OnClass.c221006.file;

// Fi
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 파일 위치 찾기
// 1. "./" -> 현재 디렉토리. 일반적으로 root 디렉토리
// root 디렉토리 = 최상위 디렉토리 = 자바 프로젝트 = LikeALion;

public class FileExercise {

    public static void printFiles() {
        // 현재 디렉토리의 파일(dir) 목록을 읽어오기
        // File(주소) 객체의 listfiles() 메소드 이용

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    // 한 글자 읽는 메소드
    public static char readAChar(String filename) throws IOException {
        // 기본적인 주소는 루트 디렉토리에서 파일을 읽음.
        // a_file.txt는 루트 디렉토리에 있으니까 오류 없이 읽어짐

        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    // 두 글자 읽는 메소드

    public static String read2Char(String filename) throws IOException {
        // 기본적인 주소는 루트 디렉토리에서 파일을 읽음.
        // a_file.txt는 루트 디렉토리에 있으니까 오류 없이 읽어짐

        FileReader fileReader = new FileReader(filename);
        String str ="";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {



//        System.out.println( readAChar("a_file.txt"));
        System.out.println(read2Char("a_file.txt"));



    }
}
