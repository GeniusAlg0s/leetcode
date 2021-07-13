import java.util.HashSet;
import java.util.Set;

class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
       Set num = new HashSet();
        for (int x:nums
             ) {
            num.add(x);
        }
        int len = num.size();
        System.out.println(num);
        return len;
    }
    public static void main(String[]args){
        int [] input = {0,0,1,1,1,2,2,3,3,4};
        int [] little = {1,1,2};
        System.out.println(removeDuplicates(input));
        System.out.println(removeDuplicates(little));
    }
}