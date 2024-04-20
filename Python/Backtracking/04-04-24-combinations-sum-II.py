from typing import List


class Solution:
    def combinationSum2(
        self, candidates: List[int], target: int
    ) -> List[List[int]]:  # noqa: E501

        result = []
        candidates.sort()

        def backtrack(start, candidates, combinations, target):
            if target < 0:
                return
            # base case: if target equals zero we have
            # found our complement from target sum
            if target == 0:
                # create copy of current combinations array
                result.append(combinations[:])
                return
            for i in range(start, len(candidates)):
                # avoid duplicate combinations: skip num
                if i > start and candidates[i] == candidates[i - 1]:
                    continue
                combinations.append(candidates[i])
                backtrack(
                    i + 1, candidates, combinations, target - candidates[i]
                )  # noqa
                combinations.pop()

        backtrack(0, candidates, [], target)

        return result


candidates = [1, 2, 3, 4, 5, 10, 8]
target = 10

solution = Solution()

res = solution.combinationSum2(candidates, target)

print(f"OUTPUT: {res}")
