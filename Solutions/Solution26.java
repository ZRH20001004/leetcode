public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return nums.length;
        int l = 1, r = 0;
        while(r < nums.length - 1) {
            while(r < nums.length - 1 && nums[r] == nums[r+1]) {
                r++;
            }
            if(r == nums.length - 1) break;
            r++;
            nums[l] = nums[r];
            l++;
        }
        if(l == 1) {
            if(nums[1] != nums[0]) return 2;
        }
        return l;
    }
}
