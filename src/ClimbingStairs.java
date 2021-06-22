class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f = 1;
        int s = 2;
        for (int i = 3; i <= n; i++) {
            int t = f + s;
            f = s;
            s = t;
        }
        return s;
    }
    public static void main(String[]args){
        System.out.println("leetcoode");
        System.out.println(climbStairs(9));
    }

}