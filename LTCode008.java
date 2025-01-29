public class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  
        int j = n - 1;  
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        LTCode008 solution = new LTCode008();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums1_2 = {1};
        int[] nums2_2 = {};
        solution.merge(nums1_2, 1, nums2_2, 0);
        System.out.println("Merged array: ");
        for (int num : nums1_2) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums1_3 = {0};
        int[] nums2_3 = {1};
        solution.merge(nums1_3, 0, nums2_3, 1);
        System.out.println("Merged array: ");
        for (int num : nums1_3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
