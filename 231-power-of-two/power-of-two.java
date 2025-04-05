class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==2147483647) return false;
       int i=0;
       int power=0;
       while(power<=n){
        power=(int)Math.pow(2,i++);
        if(power==n){
            return true;
        }
       }
       return false; 
    }
}