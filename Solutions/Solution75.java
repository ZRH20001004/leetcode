public class Solution75 {
    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int l, int h) {
        if(l >= h) return;
        int p = partition(nums, l, h);
        sort(nums, l, p - 1);
        sort(nums, p + 1, h);
    }

    private int partition(int[] nums, int l, int h) {
        int i = l, j = h + 1;
        while (true) {
            while (nums[++i] < nums[l]) {
                if (i == h) break;
            }
            while (nums[--j] > nums[l]) {
                if (j == l) break;
            }
            if(i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
