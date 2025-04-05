class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==2147483647) return false;

        int i=0;
        int pow=0;
        while(pow<=n){
            pow=(int)Math.pow(4,i++);
            if(pow==n){
                return true;
            }
        }
        return false;
    }
}