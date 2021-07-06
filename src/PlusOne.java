class PlusOne {
    public int[] plusOne(int[] digits) {
    int last = digits.length-1;
    if (last==0){
        if(digits[last]<9){
            digits[last]++;
            return digits;
        } return new int[]{1,0};
    }

        for(int i =last; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        int [] result = new int[last+2];
        result[0]=1;

        return result;
    }
}