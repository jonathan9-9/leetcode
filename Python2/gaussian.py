A = [[-2, -4, 6, 1, -6, 4, 1, -6, 47],
     [-4, -10, 16, 3, -10, 4, 4, -6, 88],
     [4, 4, -6, -1, 10, -12, 1, 18, -85],
     [2, 6, -6, 1, 12, -4, -2, 10, -76],
     [4, 4, 2, 2, 36, -26, 5, 50, -199],
     [4, 10, -14, -4, 18, 0, -7, 32, -173],
     [-6, -10, 12, 0, -26, 30, 3, -20, 111],
     [-6, -6, 8, -1, -14, 30, 9, -18, 45]]
x = [0] * 8  # 1 dimensional array of individual variable


def gua():
    rows = len(A)
    cols = len(A[0])

    print("Matrix")
    for row in A:
        print(row)

    for c in range(cols - 1):
        for r in range(c + 1, rows):
            if A[c][c] == 0:
                continue
            multiple = A[r][c] / A[c][c]
            for k in range(c, cols):
                A[r][k] -= multiple * A[c][k]

    print("\nTriangularized matrix: ")
    for row in A:
        print(row)

    x[rows - 1] = A[rows - 1][cols - 1] / A[rows - 1][cols - 2]
    for r in range(rows - 2, -1, -1):
        x[r] = A[r][cols - 1]
        for c in range(r + 1, cols - 1):
            x[r] -= A[r][c] * x[c]
        x[r] /= A[r][r]

    print("\nSolution:")
    print(x)


gua()


# # Triangularize
# for c = 0 to cols-3
# for r = c+1 to rows-1

# multiple = A[r][c]/A[c][c]
# for k = c to cols-1 {
# A[r][k] = A[r][k] - multiple*A[c][k]


# print("Triangularized Matrix")
# print(A)

# x[rows-1] = A[rows-1][cols-1]/A[rows-1][cols-2]
# variable
# for r = rows-2 down to 0
# x[r] = A[r][cols-1]
# for c = r+1 to cols-2
# x[r] = x[r] - A[r][c]*x[c]

# x[r] = x[r]/A[r][r]


# print("Solution")
# print(x)
