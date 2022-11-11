public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int p = partition(nums, i, j);
            if(p == target) {
                break;
            } else if(p < target) {
                i = p + 1;
            } else {
                j = p - 1;
            }
        }
        return nums[target];
    }

    private int partition(int[] nums, int l, int h) {
        int i = l, j = h + 1;
        while (true) {
            while (nums[++i] < nums[l]) {
                if(i == h) break;
            }
            while (nums[--j] > nums[l]) {
                if(j == l) break;
            }
            if(i >= j) break;
            exch(nums, i, j);
        }
        exch(nums, l, j);
        return j;
    }

    private void exch(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
