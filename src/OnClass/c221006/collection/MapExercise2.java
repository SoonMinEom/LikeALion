package OnClass.c221006.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {

        String str = "https://github.com/SoonMinEom/LikeALion";
        str = str.toLowerCase();

        ArrayList<Character> al = new ArrayList<>();


        for(int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if ( c >= 97 && c <= 122 ) {
                al.add(c);
            }
        }

        HashMap<Character, Integer> al_cnt = new HashMap<>();

        for (int i = 0 ; i < al.size() ; i++) {
            if(al_cnt.containsKey(al.get(i))) {
                al_cnt.put(al.get(i), al_cnt.get(al.get(i))+1);
            } else {
                al_cnt.put(al.get(i), 1);
            }
        }

        System.out.println(al_cnt);
    }
}
