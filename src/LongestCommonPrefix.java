class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
   String prefix = strs[0];
   for(int i =1;i<strs.length;i++){
       while (strs[i].indexOf(prefix) != 0){
           prefix = prefix.substring(0,prefix.length()-1);
       }
   }
        return prefix;
    }

    public static void main(String[]args){
        LongestCommonPrefix user = new LongestCommonPrefix();
        String [] input ={"flower","flow","flight"};
        System.out.println(user.longestCommonPrefix(input));
//        System.out.println(input[0].charAt(0));
    }
}