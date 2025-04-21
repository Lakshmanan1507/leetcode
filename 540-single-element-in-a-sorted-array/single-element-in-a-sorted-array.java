class Solution {
    public int singleNonDuplicate(int[] nums) {
        int uni =0;
        for(int i=0;i<nums.length;i++){
            uni^=nums[i];
        }
        return uni;
    }
}