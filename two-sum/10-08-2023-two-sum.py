# O(n) time complexity


def twoSum(self, nums, target: int) -> [int]:
    if nums == []:
        return None

    hashMap = {}

    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in hashMap and hashMap[complement] != i:
            return [i, hashMap[complement]]
        hashMap[nums[i]] = i


# O(n^2)


# def twoSum(self, nums: [int], target: int) -> [int]:
#     if nums == []:
#         return None
#     for i in range(len(nums) - 1):
#         for j in range(i + 1, len(nums)):
#             if nums[j] + nums[i] == target:
#                 return [i, j]
#     return None
