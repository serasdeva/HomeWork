package lesson1;

public class TaskOne {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsLength = m + n - 1;
        while (n - 1 >= 0) {
            if (m - 1 >= 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[numsLength--] = nums1[--m];
            } else {
                nums1[numsLength--] = nums2[--n];
            }
        }
    }
}
