class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int size = m + n;

        int[] arr = new int[size];


        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

    
        int k = 0;

        for (int i = m; i < size; i++) {
            arr[i] = nums2[k];
            k++;
        }

    
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

   
        for (int i = 0; i < size; i++) {
            nums1[i] = arr[i];
        }
    }
}