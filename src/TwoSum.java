import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
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
    public static void main(String[]args){
        int [] inputArray = {2,5,5,11};
        int target = 10;
        TwoSum pat = new TwoSum();
        System.out.println(Arrays.toString(pat.twoSum(inputArray,target)));
    }
}
