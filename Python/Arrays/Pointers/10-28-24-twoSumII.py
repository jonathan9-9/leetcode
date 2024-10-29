def twoSumII(numbers, target):
    left = 0
    right = len(numbers) - 1

    while left < right:
        current_sum = numbers[left] + numbers[right]

        if current_sum == target:
            return [left + 1, right + 1]
        elif current_sum > target:
            right -= 1
        else:
            left += 1


numbers = [2, 11, 7, 15]
target = 9

print(twoSumII(numbers, target))
