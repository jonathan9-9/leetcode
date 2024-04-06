class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        left = 0
        max_substring_length = 0
        char_idx_dict = {}

        for right in range(len(s)):
            if s[right] in char_idx_dict and char_idx_dict[s[right]] >= left:
                left = char_idx_dict[s[right]] + 1
            char_idx_dict[s[right]] = right
            max_substring_length = max(max_substring_length, right - left + 1)

        return max_substring_length


inputString = "oneee"

answer = Solution()

res = answer.lengthOfLongestSubstring(inputString)

print(f"output: {res}")
