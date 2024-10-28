
from typing import List


def maxProduct(self, nums: List[int]) -> int:
    currentProduct = 1
    maxProduct = nums[0]

    for right in range(len(nums)):
        currentProduct *= nums[right]

    if currentProduct > maxProduct:
        maxProduct = currentProduct

    if currentProduct == 0:
        currentProduct = 1

    currentProduct = 1
    for left in range(len(nums) - 1, -1, -1):
        currentProduct *= nums[left]
        if currentProduct > maxProduct:
            maxProduct = currentProduct
        if currentProduct == 0:
            currentProduct = 1

    return maxProduct
