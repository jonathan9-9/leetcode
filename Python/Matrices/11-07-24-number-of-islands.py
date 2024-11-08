from typing import List


def numIslands(grid: List[List[str]]) -> int:
    if len(grid) == 0:
        return 0
    rows = len(grid)
    columns = len(grid[0])

    number_of_islands = 0

    def dfs(grid, row, col):

        if row >= rows or col >= columns or row < 0 or col < 0 or grid[row][col] == "0":
            return
        grid[row][col] = "0"

        dfs(grid, row + 1, col)
        dfs(grid, row - 1, col)
        dfs(grid, row, col + 1)
        dfs(grid, row, col - 1)

    for row in range(rows):
        for column in range(columns):
            if grid[row][column] == "1":
                number_of_islands += 1
                dfs(grid, row, column)

    return number_of_islands
