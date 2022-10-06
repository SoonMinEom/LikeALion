package OnClass.c221006.collection;

//1. 리스트 생성, 우리반 이름 넣기
//2. 리스트 생성, 여러 정보 동시에 넣기

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> sutdents;

    public ListExercise() {

        this.sutdents = new ArrayList<>();
        this.sutdents.add("김경록");
        this.sutdents.add("엄순민");
        this.sutdents.add("가나다");
        this.sutdents.add("라마바");
        this.sutdents.add("사아자");
    }

    public List<String> getSutdents() {
        return this.sutdents;
    }
}
