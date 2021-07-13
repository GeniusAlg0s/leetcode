import java.util.Arrays;

class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        int length = 0;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}