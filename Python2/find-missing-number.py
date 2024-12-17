import random


def findMissingNumber(numbers):

    number = len(numbers) + 1
    expected_sum = number * (number + 1) // 2

    actual_sum = sum(numbers)

    missing_number = expected_sum - actual_sum

    print(f"The missing number is: {missing_number}")

    return missing_number


number_list = [i for i in range(1, 101)]

number_list.remove(69)

random.shuffle(number_list)

findMissingNumber(number_list)
