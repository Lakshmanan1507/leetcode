class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> equ = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                max.add(nums[i]);
            } else if (nums[i] == pivot) {
                equ.add(nums[i]);
            } else {
                min.add(nums[i]);
            }
        }
        // ArrayList <Integer> arr=new ArrayList<> ();
        min.addAll(equ);
        min.addAll(max);
        int n = min.size();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = min.get(j);
        }
        return arr;
    }
}