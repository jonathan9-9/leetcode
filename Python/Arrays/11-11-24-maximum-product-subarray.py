from typing import List


def maxProduct(self, nums: List[int]) -> int:
    if not nums:
        return 0

    result = nums[0]

    product = 1
    for num in nums:
        product *= num
        result = max(result, product)

        if product == 0:
            product = 1

    product = 1
    for num in reversed(nums):
        product *= num
        result = max(product, result)

        if product == 0:
            product = 1

    return result
