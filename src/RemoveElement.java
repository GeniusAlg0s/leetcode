class RemoveElement {
    public static int removeElement(int[] nums, int val) {
    int length = nums.length;
    int j = 0;
        for(int i=0; i< length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int num:nums
             ) {
            System.out.println(num);
        }
        return j;
    }
    public static void main(String[]args){
        int [] nums ={3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}