public class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;  

        for (int i = m - 1, j = n - 1; i >= 0 || j >= 0; k--) {
            if (i >= 0 && (j < 0 || nums1[i] > nums2[j])) {
                nums1[k] = nums1[i--];
            } else if (j >= 0) {
                nums1[k] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        LTCode008 solution = new LTCode008();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
