package OnClass.c221006.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        List<Integer> randomNumber = new ArrayList<>();

        for(int i = 0 ; i <50 ; i++) {
            int r = randomNumberGenerator.generator(10);
            randomNumber.add(r);
        }

        System.out.println(randomNumber);

        Set<Integer> withoutD = new HashSet<>();

        for(int i = 0 ; i <50 ; i++) {
            withoutD.add(randomNumber.get(i));
        }

        System.out.println(withoutD);



    }
}
