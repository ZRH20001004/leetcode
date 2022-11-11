import java.util.Deque;
import java.util.LinkedList;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stackS = new LinkedList<>();
        Deque<Character> stackT = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            } else {
                stackS.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            } else {
                stackT.push(ch);
            }
        }
        while(!stackS.isEmpty() && !stackT.isEmpty()) {
            if(stackS.peek() == stackT.peek()) {
                stackS.pop();
                stackT.pop();
            } else{
                return false;
            }
        }
        return stackT.isEmpty() && stackS.isEmpty();
    }
}
