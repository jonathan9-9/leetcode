from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        result = []

        def swap(nums, i, j):
            nums[i], nums[j] = nums[j], nums[i]

        def recurse(start_idx, nums):
            if start_idx == len(nums) - 1:
                result.append([x for x in nums])

            for i in range(start_idx, len(nums)):
                swap(nums, start_idx, i)
                recurse(start_idx + 1, nums)
                swap(nums, start_idx, i)

        recurse(0, nums)

        return result
