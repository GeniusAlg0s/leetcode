import java.math.BigInteger;

public class AddBinary {
    public static String addBinary(String a, String b) {
        String r = "";
        int answer = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i>=0 || j>=0 || answer == 1){
            answer += ((i>=0)? a.charAt(i)-'0':0);
            answer += ((j>=0)? a.charAt(j)-'0':0);

            r += r+ ((char)(answer%2+'0'));

            answer/= 2;
            i--;
            j--;
        }
        return r;

    }
    public static void main(String []args){
        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010","1011"));
    }
}