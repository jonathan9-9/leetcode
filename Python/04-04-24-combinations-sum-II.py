from typing import List


class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:

        result = []
        combinations = []

        candidates.sort()

        if target < 0:
            return

        if target == 0:
            combinations.append(x for x in combinations)

        def backtrack(start, candidates, combinatons):
            for i in range(start, len(candidates)):
                if start > i and candidates[i] == candidates[i - 1]:
                    continue

        backtrack(0, candidates, [])
