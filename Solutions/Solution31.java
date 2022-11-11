import java.util.ArrayDeque;
import java.util.Deque;

public class Solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new ArrayDeque<>();
        int j = 0;
        for(int elem : pushed) {
            deque.push(elem);
            while(j < popped.length && !deque.isEmpty() && deque.peek() == popped[j]) {
                deque.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}
