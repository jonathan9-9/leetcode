class Solution:
    def removeDuplicates(self, s: str, k: int) -> str:

        stack = []

        for char in s:
            if stack and stack[-1][0] == char:
                stack[-1][1] += 1
            else:
                stack.append([char, 1])
            if stack[-1][1] == k:
                stack.pop()

        removed_duplicate_string = ""

        for char, count in stack:
            removed_duplicate_string += char * count

        return removed_duplicate_string
