from typing import List


def minMaxAverage(nums: List[int], k: int) -> float:
    current_sum = sum(nums[:k])
    max_sum = current_sum

    for i in range(k, len(nums)):
        current_sum = current_sum + nums[i] - nums[i - k]
        max_sum = max(current_sum, max_sum)

    return max_sum / k


print(minMaxAverage([1, 12, -5, -6, 50, 3], 4))
