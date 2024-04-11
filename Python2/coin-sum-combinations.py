# Given a set of coin values coins = {c1, c2, ... ck} and a
# target sum of money m, in how many ways can we form a
# the sum m using these coins?


from collections import defaultdict
from typing import List


def how_many_ways(m, coins):
    memo = defaultdict(lambda _: 0)

    memo[0] = 1

    for i in range(1, m + 1):
        memo[i] = 0

        for coin in coins:
            subproblem = i - coin
            if subproblem < 0:
                continue

            memo[i] = memo[i] + memo[subproblem]

    return memo[m]


print(how_many_ways(5, [1, 4, 5]))


# LC: Coin Change II


class DP_solution:
    def change(self, amount: int, coins: List[int]) -> int:

        memo = defaultdict(int)

        memo[0] = 1

        for coin in coins:
            for i in range(coin, amount + 1):
                memo[i] += memo[i - coin]

        return memo[amount]
