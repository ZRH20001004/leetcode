
public class Solution17 {
    public int[] printNumbers(int n) {
        int[] res;
        int max = 9;
        for (int i = 1; i < n; i++) {
            i *= 10;
            max += 9 * i;
        }
        res = new int[max];
        for (int i = 0; i < max; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
