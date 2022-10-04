public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello World"); // 알트 쉬프트 에프10 : 실행 단축키, 한 번 설정 이후엔 그냥 쉬프트 에프10 ㄱㄱ

        //10칸의 int array를 만들고
        //1~10까지 채워보기
        //그리고 출력하기

        int[] intArray = new int[10];

        for( int i = 0 ; i < intArray.length ; i++) {
            intArray[i] = i+1;
            System.out.println(intArray[i]);
        }
    }
}
