import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/////patwilliams geniusAlg0s
class TwoSum {
    public int[] twoSumOne(int[] nums, int target) {

        int sum =0;
        int[] notfound = new int[] {};
        for(int pointerA = 0; pointerA<nums.length; pointerA++){
            for(int pointerB = pointerA+1; pointerB<nums.length;pointerB++){
                if((nums[pointerB]+nums[pointerA]) == target){
                    int []tempR = {pointerA,pointerB};
                    return tempR;
                }
            }
        }
        return notfound;
    }
    public int[] twoSum(int[] nums, int target) {
        int[] notfound = new int[] {};
        Map<Integer,Integer> sumMap = new HashMap<>();
        for (int i =0; i < nums.length;i++){
            int possibleValue = target-nums[i];
            if(sumMap.containsKey(possibleValue)){
                return new int[] { sumMap.get(possibleValue), i };
            }
            sumMap.put(nums[i],i);
        }
        return notfound;
    }
    public static void main(String[]args){
        int [] inputArray = {2,5,5,11};
        int target = 10;
        TwoSum pat = new TwoSum();
        System.out.println(Arrays.toString(pat.twoSum(inputArray,target)));
    }
}
