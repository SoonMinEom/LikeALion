package OnClass.c221012.codingTest;

// Template Callback 패턴을 적용한, 다형성 활용
// pirvate Template Method 클래스 안에서만 호출되는 Template을 만듭니다.
// public – max(), min() 메소드에서 Template Method를 호출 합니다.
// 바뀐 부분만 내부 클래스로 구현해서 parameter로 넘깁니다.
// interface를 선언 합니다.


//Template
interface Compare {
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {

    // Template Method!!
    private int getMaxOrMin(int[] arr, Compare compare) { //callback
    // callback : 자신을 호출한 메소드로 돌아갑니다.
        // max에서 호출되면, 다시 max로 돌아감.
        int targetValue = arr[0];

        for (int i = 1 ; i <arr.length ; i ++) {
            boolean isSth = compare.doSomething(arr[i], targetValue);
            if(isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin mam = new MaxAndMin();
        int max = mam.max(arr);

        System.out.println(max);
    }
}
