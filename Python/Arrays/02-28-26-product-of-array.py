def product_of_array(nums):
    if not nums:
        return []
    n = len(nums)
    result = [1] * n

    prefix_product = 1
    for i in range(n):
        result[i] = prefix_product
        prefix_product *= nums[i]

    suffix_product = 1
    for i in reversed(range(n)):
        result[i] *= suffix_product
        suffix_product *= nums[i]
    return result


# test case 1: [1, 2, 3, 4] -> Output: [24, 12, 8, 6]
print(product_of_array([1, 2, 3, 4]))
