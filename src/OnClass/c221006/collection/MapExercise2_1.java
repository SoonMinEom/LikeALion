package OnClass.c221006.collection;

public class MapExercise2_1 {


    public static boolean isAlpha(char c) {
        if ( (c >='A' && c <='Z') || (c >= 'a' && c <='z') ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "aaaaabbbcccddefghijkkkkllm";
        char[] ch = new char[s1.length()];

        for (int i = 0 ; i < s1.length() ; i ++) {
            ch[i] = s1.charAt(i);
        }

        for (int i = 0 ; i < s1.length() ; i ++) {
            System.out.println(ch[i]);
        }


    }
}
