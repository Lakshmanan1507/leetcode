class Solution {
    public boolean canAliceWin(int[] nums) {
        int ans=0;
        int ans1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                ans+=nums[i];
            }
            else{
                ans1+=nums[i];
            }
        }
        return ans!=ans1;
    }
}