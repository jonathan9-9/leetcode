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

# ------

# binary_search_recursive takes four parameters: the sorted array arr, the
#  target element target, and the low and high indices of
# the current search interval.
# If the low index becomes greater than the high index, it means the target
# element is not present in the array, so it returns -1.
# Otherwise, it calculates the mid index of the current search interval and
#  checks if the element at the mid index is equal to the target.
# If the element is found, it returns the index of the element.
# If the element is not found, it recursively searches in either the left or
# right half of the array, depending on whether the target is less than or
# greater than the element at the mid index.


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

# -------


def find_path(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    return find_path_recursive(matrix, rows, cols, 0, 0)


def find_path_recursive(matrix, rows, cols, row, col):
    # Base case: If reached the bottom-right corner
    if row == rows - 1 and col == cols - 1:
        return [[row, col]]

    # Check if current cell is blocked or out of bounds
    if row >= rows or col >= cols or matrix[row][col] == 1:
        return None

    # Try moving right
    right_path = find_path_recursive(matrix, rows, cols, row, col + 1)
    if right_path is not None:
        return [[row, col]] + right_path

    # Try moving down
    down_path = find_path_recursive(matrix, rows, cols, row + 1, col)
    if down_path is not None:
        return [[row, col]] + down_path

    # If both right and down movements are not possible
    return None


# Test the function
matrix = [[0, 1, 0, 0], [0, 0, 1, 0], [1, 0, 0, 0], [0, 1, 0, 0]]

path = find_path(matrix)
if path:
    print("Path found:")
    for row, col in path:
        print(f"({row}, {col})")
else:
    print("No path found.")
