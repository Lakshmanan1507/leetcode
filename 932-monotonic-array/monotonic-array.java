class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase=true;
        boolean decrease=true;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
                increase=false;
            if(nums[i-1]>nums[i]){
                decrease=false;
            }
        }
        if(increase || decrease){
            return true;
        }
        return false;
    }
}