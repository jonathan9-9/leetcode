# import math


# nums = [16, 64, 144]

# square_root_nums = list(map(lambda x: math.sqrt(x), nums))

# print("square root of nums", square_root_nums)


def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


# Test the function
print("Fibonacci sequence:")
for i in range(10):
    print(fibonacci(i))
