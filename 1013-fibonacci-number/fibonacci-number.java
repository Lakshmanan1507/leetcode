class Solution {
    public int fib(int n) {
        if(n<=1) return n;
       int f1=0;
       int f2=1;
       int temp=0;
       for(int i=2;i<=n;i++){
         temp=f1+f2;
        f1=f2;
        f2=temp;
       }
       return temp; 
    }
}