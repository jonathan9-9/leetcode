def count_ways(n, allowed_steps):
    if n == 0:
        return 1

    if n < 0:
        return 0

    total_ways = 0
    for step in allowed_steps:
        total_ways += count_ways(n - step, allowed_steps)

    return total_ways


# Example usage:
n = 4
allowed_steps = [1, 3]
print(count_ways(n, allowed_steps))  # Output: 3
