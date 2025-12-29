class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
     for(int i =0;i<nums.length;i++){
        if(iseven(nums[i])){
            count++;
        }
     }
     return count;   
    }
    static boolean iseven(int n){
        int count =0;
        // while(n>0){
        //     n/=10;
        //     count++;
        // }
        count = (int)(Math.log10(n)+1);
        return count%2==0;
    }
}