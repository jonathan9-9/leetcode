import heapq
from collections import Counter


def topKFrequent(nums, k):
    count = Counter(nums)
    return heapq.nlargest(k, count.keys(), key=count.get)


print(topKFrequent([1, 1, 1, 2, 3, 3, 3, 3], 2))
