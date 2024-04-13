def sum_numbers(n):
    if n == 0:
        return 0

    else:
        return n % 10 + sum_numbers(int(n // 2))


print(sum_numbers(596))
