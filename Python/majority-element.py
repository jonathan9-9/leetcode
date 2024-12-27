from collections import Counter
from typing import List


def majorityElement(nums: List[int]) -> int:
    max_freq = Counter(nums)

    print(f"Data structure of Counter: {max_freq}")

    max_count = float('inf')
    num_most_seen = 0


# iterates through each numbers and its count
# More comments
    for num, count in max_freq.items():
        if count > max_count:
            num_most_seen = num
    return num_most_seen


majorityElement([2, 7, 7, 7, 1, 10, 9, 9])
