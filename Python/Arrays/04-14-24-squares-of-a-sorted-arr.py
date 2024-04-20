from typing import List


# Optimized Solution
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:

        result = [0] * len(nums)

        i, j = 0, len(nums) - 1
        for end in reversed(range(len(nums))):
            arr_i = nums[i] ** 2
            arr_j = nums[j] ** 2
            if arr_i > arr_j:
                result[end] = arr_i
                i += 1
            else:
                result[end] = arr_j
                j -= 1

        return result


# nums = [-4, -1, 0, 3, 10]
# output = [0, 1, 9, 16, 100]


# class Solution:
#     def sortedSquares(self, nums: List[int]) -> List[int]:

#         n = len(nums)

#         arr = [0] * n

#         for i in range(n):
#             arr[i] = pow(nums[i], 2)

#         arr.sort(reverse=False)

#         return arr
