import javax.sound.midi.Soundbank;

public class palidrome {
    public static boolean isPalindrome(String s) {
        String b = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder c = new StringBuilder(b);
        System.out.println("given "+s);
        System.out.println("regex "+b);
        c.reverse();
        System.out.println("reversed  "+c);
        String res = c.toString();
        System.out.println("tostring   " + res);

        if (res.equals(b)) {
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        String a = "A man, a plan, a canal: Panama";
        String z = "race a car";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(z));

    }
}
