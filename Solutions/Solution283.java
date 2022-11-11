public class Solution283 {
    public void moveZeroes(int[] nums) {
        for(int l = 0; l < nums.length - 1; l++) {
            if(nums[l] == 0) {
                int r = l+1;
                while(r < nums.length - 1 && nums[r] == 0) {
                    r++;
                }
                if(r == nums.length) break;
                swap(nums, l, r);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
