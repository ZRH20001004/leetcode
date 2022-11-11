public class Solution27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int l = -1, r = nums.length;
        while(true) {
            while(nums[++l] != val) {
                if(l == nums.length - 1) break;
            }
            while(nums[--r] == val) {
                if(r == 0) break;
            }
            if(l >= r) break;
            swap(nums, l, r);
        }
        return nums[r] == val? r : r+1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
