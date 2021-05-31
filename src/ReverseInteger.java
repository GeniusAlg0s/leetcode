import java.util.*;
/////patwilliams geniusAlg0s
class ReverseInteger {
    public int reverse(int x) {
        StringBuilder alomstThere = new StringBuilder();
        int y = Math.abs(x);
        String xAsString = String.valueOf(y);
        alomstThere.append(xAsString);
        String reversed = alomstThere.reverse().toString();
        try{
            if(x<0){
                System.out.println(Integer.parseInt(reversed)* -1);
            }else {
                System.out.println(Integer.parseInt(reversed));
            }
            return (x <0) ? Integer.parseInt(reversed)* -1: Integer.parseInt(reversed);
        }catch (NumberFormatException error){
            return 0;
        }
    }


    public static void main(String[]args){
        ReverseInteger user = new ReverseInteger();
        user.reverse(-456789);
    }
}
