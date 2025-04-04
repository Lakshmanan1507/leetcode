class Solution {
    public int mySqrt(int x) {
        int ans=0;
        for(long i=1;i<=x;i++){
           long val=i*i;
           if(val<=(long)x){
            ans=(int)i;
           } 
           else{
            break;
           }
        }
        return ans;
    }
}