import java.util.ArrayDeque;
import java.util.Deque;

public class Solution12 {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 if(dfs(board, word.toCharArray(), i, j, 0)) {
                     return true;
                 }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i == board.length || i < 0 || j == board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if(k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i, j - 1, k + 1)
                || dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1);
        board[i][j] = word[k];
        return res;
    }
}
