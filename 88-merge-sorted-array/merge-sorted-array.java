class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           
        int j = m + n - 1;        
        int k = n - 1;            
        // Compare from the end and place the larger element at the end of nums1
        while (i >= 0 && k >= 0) {
            if (nums1[i] > nums2[k]) {
                nums1[j--] = nums1[i--];
            } else {
                nums1[j--] = nums2[k--];
            }
        }
        //If there are remaining elements in nums2, fill them in nums1
        while (k >= 0) {
            nums1[j--] = nums2[k--];
        }
    }
}