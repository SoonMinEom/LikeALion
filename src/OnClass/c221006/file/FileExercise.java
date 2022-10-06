package OnClass.c221006.file;

// Fi
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        // 파일 위치 찾기
        // 1. "./" -> 현재 디렉토리. 일반적으로 root 디렉토리
        // root 디렉토리 = 최상위 디렉토리 = 자바 프로젝트 = LikeALion;

       // FileReader fileReader = new FileReader("./a_file.txt");


        // 현재 디렉토리의 파일(dir) 목록을 읽어오기
        // File(주소) 객체의 listfiles() 메소드 이용
        File dir = new File("./");

        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }

    }
}
