import java.util.*;

public class RemoveAdjacentDuplicatesInStringII {
    class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == c) {
                Pair<Character, Integer> top = stack.pop();
                stack.push(new Pair<>(top.getKey(), top.getValue() + 1));
            } else {
                stack.push(new Pair<>(c, 1));
            }
            if (!stack.isEmpty() && stack.peek().getValue() == k) {
                stack.pop();
            }
        }

        StringBuilder removedDuplicateString = new StringBuilder();

        for (Pair<Character, Integer> pair : stack) {
            char c = pair.getKey();
            int count = pair.getValue();
            for (int i = 0; i < count; i++) {
                removedDuplicateString.append(c);
            }
        }

        return removedDuplicateString.toString();
    }
}
}
