class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start=0,end=n,index=0;
        int arr[]=new int[nums.length];
        while(end<nums.length){
            arr[index++]=nums[start++];
            arr[index++]=nums[end++];
        }
        return arr;
    }
}