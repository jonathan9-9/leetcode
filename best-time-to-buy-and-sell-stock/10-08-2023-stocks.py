# Implementation of Kadane's algorithm


def maxProfit(self, prices: [int]) -> int:
    maxProfit = 0
    R = 1  # sell
    L = 0  # buy
    while R < len(prices):
        current = prices[R] - prices[L]
        if prices[R] > prices[L]:
            maxProfit = max(maxProfit, current)
        else:
            L = R
        R += 1
    return maxProfit


# O(n^2)


# def maxProfit(self, prices: [int]) -> int:
#     maxProfit = 0
#     i = 0

#     while i < len(prices) - 1:
#         j = i + 1
#         while j < len(prices):
#             profit = prices[j] - prices[i]
#             if profit > maxProfit:
#                 maxProfit = profit
#             j += 1

#         i += 1

#     return maxProfit
