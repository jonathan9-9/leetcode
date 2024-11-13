from collections import Counter
from typing import List


def majorityElement(nums: List[int]) -> int:
    max_freq = Counter(nums)

    max_count = float('inf')
    num_most_seen = 0

    for num, count in max_freq.items():
        if count > max_count:
            num_most_seen = num
    return num_most_seen
