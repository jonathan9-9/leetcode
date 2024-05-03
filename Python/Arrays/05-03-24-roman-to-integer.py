class Solution:
    def romanToInt(self, s: str) -> int:
        hash_map = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }  # noqa
        sum = 0
        prev_value = 0
        for i in s[::-1]:
            curr = hash_map[i]

            if curr < prev_value:
                sum -= curr
            else:
                sum += curr

            prev_value = curr

        return sum
