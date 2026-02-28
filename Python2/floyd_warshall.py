import math

graph = [
    [3, 0, 8, math.inf],
    [math.inf, 0, math.inf, 1],
    [math.inf, 4, 0, math.inf],
    [math.inf, math.inf, 2, 0],
]

n = len(graph)


def Floyd_Warshall(i: int, j: int, k: int) -> float:
    if k < 0:
        return graph[i][j]
    else:
        return min(Floyd_Warshall(i, j, k - 1), Floyd_Warshall(i, k, k - 1) + Floyd_Warshall(k, j, k - 1))


def all_pairs_shortest_paths():
    n = len(graph)
    distances = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            distances[i][j] = Floyd_Warshall(i, j, n - 1)
    return distances


result = all_pairs_shortest_paths()

print("Shortest path matrix:")
for row in result:
    print(row)
