# O(n) time complexity


def twoSum(self, nums, target: int) -> [int]:
    dict = {}

    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in dict and dict[complement] != i:
            return [dict[complement], i]

        dict[nums[i]] = i


nums = [3, 2, 4]
target = 6
print(twoSum(None, nums, target))

# O(n^2)


# def twoSum(self, nums: [int], target: int) -> [int]:
#     if nums == []:
#         return None
#     for i in range(len(nums) - 1):
#         for j in range(i + 1, len(nums)):
#             if nums[j] + nums[i] == target:
#                 return [i, j]
#     return None
