public class Permutations {
    public void nextPermutation(int[] nums) {
        int  i = nums.length-2;
        while (i>=0 && nums[i+1]<=nums[i]) i--;
        if(i>=0){
            int j = nums.length-1;
            while (nums[j]<= nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1);
    }
    private void swap(int[] nums, int i, int j) {
        int tempValue = nums[i];
        nums[i] = nums[j];
        nums[j] = tempValue;
    }
    private void reverse(int[] nums, int start) {
        int endPointer = nums.length-1;
        int startPointer = start;
         while (startPointer < endPointer){
             swap(nums, startPointer,endPointer);
             startPointer++;
             endPointer--;
         }
    }
}
