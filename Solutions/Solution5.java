public class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        int max = 1;
        char[] ch = s.toCharArray();
        String res = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                int len = Palindrome(ch, i, j);
                if(max < len) {
                    max = len;
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
    private int Palindrome(char[] ch, int l, int h) {
        int i = l, j = h;
        while(i < j) {
            if(ch[i] != ch[j]) return 0;
            i++;
            j--;
        }
        return h - l + 1;
    }
}
