class Palindrome {
/*patwilliams geniusAlg0s
*
 */
    public boolean isPalindrome(int x) {
        StringBuilder pCheck = new StringBuilder().append(x);
        System.out.println(pCheck);
        pCheck.reverse();
        System.out.println(pCheck);
        String input = String.valueOf(x);
        System.out.println(input);
        System.out.println((input.equals(pCheck.toString()))? true:false);
        return (input.equals(pCheck.toString()))? true:false;

    }
    public static void main(String []args){
        Palindrome users = new Palindrome();
        users.isPalindrome(-12121);
    }
}
