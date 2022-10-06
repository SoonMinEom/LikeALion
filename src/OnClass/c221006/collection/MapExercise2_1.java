package OnClass.c221006.collection;

import java.util.HashMap;

public class MapExercise2_1 {


    public static boolean isAlpha(char c) {
        if ( (c >='A' && c <='Z') || (c >= 'a' && c <='z') ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "aaaaabbbcccddefghijkkkkllm".toUpperCase();

        HashMap<Character, Integer> alphaMap = new HashMap<>();

        for (char c = 'A' ; c <= 'Z' ; c++) {
            alphaMap.put(c, 0);
        }

        for (int i = 0 ; i < s1.length() ; i ++) {
            char c = s1.charAt(i);
            if(isAlpha(c)){
                alphaMap.put(c, alphaMap.get(c)+1);
            }
        }

        System.out.println(alphaMap);

    }
}
