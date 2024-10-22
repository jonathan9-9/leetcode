# Implementation of Kadane's algorithm

def maxProfit(self, prices: [int]) -> int:
    left = 0    # buy
    right = 1  # sell
    maxProfit = 0

    while right < len(prices):
        currentProfit = prices[right] - prices[left]

        if prices[right] > prices[left]:
            maxProfit = max(maxProfit, currentProfit)

        else:
            left = right

        right += 1

    return maxProfit


# O(n)
# def maxProfit(self, prices: [int]) -> int:
#     minPrice = float('inf')
#     maxProfit = prices[0]

#     for price in prices:
#         if price < minPrice:
#             minPrice = price
#         else:
#             maxProfit = max(maxProfit, price - minPrice)
#     return maxProfit


# O(n^2)

# def maxProfit(self, prices: [int]) -> int:
#     maxProfit = 0
#     left = 0

#     while left < len(prices) - 1:
#         right = left + 1

#         while right < len(prices):
#             current = prices[right] - prices[left]
#             if current > maxProfit:
#                 maxProfit = current
#             right += 1
#         left += 1
#     return maxProfit


# prices = [7, 6, 4, 3, 1]

# print(maxProfit(None, prices))
