public class Solution53 {
    public int maxSubArray(int[] nums) {
       int res = nums[0];
       int temp = nums[0];
       for(int i = 1; i < nums.length; i++) {
           if(temp + nums[i] > nums[i]) {
               temp = temp + nums[i];
           } else {
               temp = nums[i];
           }
           if(temp > res) {
               res = temp;
           }
       }
       return res;
    }
}
