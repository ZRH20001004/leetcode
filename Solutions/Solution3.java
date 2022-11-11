import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if(map.get(s.charAt(r)) > 1) {
                while(map.get(s.charAt(r)) > 1) {
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    l++;
                }
            } else {
                if(max < r - l + 1) {
                    max = r - l + 1;
                }
            }
        }
        return max;
    }
}
