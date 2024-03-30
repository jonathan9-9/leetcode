from typing import List


class Solution:
    def partition(self, s: str) -> List[List[str]]:

        partition = []

        def is_palindrome(substring):
            return substring == substring[::-1]

        def backtrack(start, path):
            if start == len(s):
                partition.append(path[:])
                return

            for end in range(start + 1, len(s) + 1):
                if is_palindrome(s[start:end]):
                    backtrack(end, path + [s[start:end]])

        backtrack(0, [])

        return partition
