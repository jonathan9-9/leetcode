import java.util.*;

public class RemoveAdjacentDuplicatesInStringII {

    public static String removeDuplicates(String s, int k) {
        Stack<Map.Entry<Character, Integer>> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().getKey() == c) {
                Map.Entry<Character, Integer> top = stack.pop();
                stack.push(new AbstractMap.SimpleEntry<>(top.getKey(), top.getValue() + 1));
            } else {
                stack.push(new AbstractMap.SimpleEntry<>(c, 1));
            }
            if (!stack.isEmpty() && stack.peek().getValue() == k) {
                stack.pop();
            }
        }

        StringBuilder removedDuplicateString = new StringBuilder();

        for (Map.Entry<Character, Integer> pair : stack) {
            char c = pair.getKey();
            int count = pair.getValue();
            for (int i = 0; i < count; i++) {
                removedDuplicateString.append(c);
            }
        }

        return removedDuplicateString.toString();
    }

    public static void main(String[] args) {
        String result = RemoveAdjacentDuplicatesInStringII.removeDuplicates("pqqqprrsssppp", 3);
        System.out.println(result);
    }

}
