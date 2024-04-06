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


# [3,2,5,1,5,2,6,4] target = 7

# result = [[2,5], [1,6], [3,4]]
