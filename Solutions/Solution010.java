import java.util.HashMap;
import java.util.Map;

public class Solution010 {
    public int subarraySum(int[] nums, int k) {
      Map<Integer, Integer> map = new HashMap<>();
      int cnt = 0, pre = 0;
      map.put(0,1);
      for(int n : nums) {
          pre += n;
          cnt += map.getOrDefault(pre - k, 0);
          map.put(pre,map.getOrDefault(pre, 0) + 1);
      }
      return cnt;
    }
}
