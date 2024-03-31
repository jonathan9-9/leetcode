# import math


# nums = [16, 64, 144]

# square_root_nums = list(map(lambda x: math.sqrt(x), nums))

# print("square root of nums", square_root_nums)


# def fibonacci(n):
#     if n <= 1:
#         return n
#     else:
#         return fibonacci(n - 1) + fibonacci(n - 2)


# # Test the function
# print("Fibonacci sequence:")
# for i in range(10):
#     print(fibonacci(i))


def binary_search(arr, target):
    return binary_search_recursive(arr, target, 0, len(arr) - 1)


def binary_search_recursive(arr, target, low, high):
    if low > high:
        return -1  # Element not found
    mid = (low + high) // 2
    if arr[mid] == target:
        return mid  # Element found at index mid
    elif arr[mid] < target:
        return binary_search_recursive(arr, target, mid + 1, high)
    # Search right half ^^
    else:
        return binary_search_recursive(arr, target, low, mid - 1)
    # Search left half ^^


# Test the function
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target = 7
result = binary_search(arr, target)
if result != -1:
    print(f"Element {target} found at index {result}.")
else:
    print(f"Element {target} not found in the array.")
