class Solution:
    def countSubstrings(self, s: str) -> int:
        n = len(s) - 1
        count = 0
        left = 0
        right = 0
        while right <= n:
            substring = s[left:right + 1]
            if substring == substring[::-1]:
                count += 1
            right += 1
            if right > n:
                left += 1
                right = left

        return count


print(Solution().countSubstrings("abccba"))
# output: 9
