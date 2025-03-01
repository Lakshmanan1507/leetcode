class Solution {
  public int countPartitions(int[] nums) {
    int even = 0;
    int sum = 0;
    for (int a : nums) {
      sum += a;
    }
    int i = 0;
    int total = 0;
    while (i != nums.length - 1) {
      total += nums[i];
      if ((total + (sum - total)) % 2 == 0)
        even++;
      i++;
    }
    return even;
  }
}