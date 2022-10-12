package OnClass.c221013.practice;

public class MaxOrMin {

    private int getMaxOrMin(int[] arr, Compare compare) {
        int target = arr[0];

        for(int i = 1 ; i < arr.length ; i ++) {
            boolean run = compare.biggerOrSmaller(arr[i], target );
            if(run) {
                target = arr[i];
            }
        }
        return target;
    }

    public int getMax(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean biggerOrSmaller(int arrValue, int targetValue) {
                return arrValue > targetValue;
            }
        });
    }

    public int getMin(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean biggerOrSmaller(int arrValue, int targetValue) {
                return arrValue < targetValue;
            }
        });
    }


    public static void main(String[] args) {

        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        MaxOrMin mom = new MaxOrMin();
        int result = mom.getMax(arr);
        int result2 = mom.getMin(arr);

        System.out.println(result);
        System.out.println(result2);

    }
}
