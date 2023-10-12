def longestConsecutive(self, nums: [int]) -> int:
    if not nums:
        return 0

    number_set = set(nums)
    longest = 0

    for num in number_set:
        # prev number
        if num - 1 not in number_set:
            current_num = num
            streak = 1

            while current_num + 1 in number_set:
                current_num += 1
                streak += 1

            longest = max(longest, streak)

    return longest
