def sum_numbers(n):
    if n == 0:
        return 0

    else:
        return n % 10 + sum_numbers(int(n // 10))


print(sum_numbers(1037))
