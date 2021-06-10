class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }else if (haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[]args){
      int result =  strStr("aaaaa","");
        System.out.println(result);
    }
}