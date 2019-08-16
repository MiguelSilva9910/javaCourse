package course.TwoSums;
import java.util.Arrays;


public class TwoSums {
    public static void main(String[] args){
        int[] array1 = new int[]{2,4,7,9,10};
        int target = 11;
        System.out.println("The Value is -> " + Arrays.toString(twoSumsTarget(array1, target)));
    };
    public static int[] twoSumsTarget(int[] nums, int target){
        int results;
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                results = i + j;
                if (results == target) {
                    return new int[]{i, j};
                } else {
                    continue;
                }
            }
        }
        return new int[]{0,0};
    };
};
