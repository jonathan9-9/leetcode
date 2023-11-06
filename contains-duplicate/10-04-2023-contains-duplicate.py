def containsDuplicate(self, nums: [int]) -> bool:
    num_dict = set()
    for num in nums:
        if num in num_dict:
            return True
        num_dict.add(num)
    return False
