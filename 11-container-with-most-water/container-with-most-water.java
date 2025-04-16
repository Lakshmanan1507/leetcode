class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int currentArea = 0, maxArea = 0;
        while (left < right) {
            currentArea = (int) (Math.min(height[left], height[right]) * (right - left));
            maxArea = Math.max(currentArea, maxArea);
            if (height[left] <= height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
        }
        return maxArea;
    }
}