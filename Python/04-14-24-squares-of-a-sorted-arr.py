from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:

        n = len(nums)

        arr = [0] * n

        for i in range(n):
            arr[i] = pow(nums[i], 2)

        arr.sort(reverse=False)

        return arr
