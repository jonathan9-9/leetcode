def getAnswersToQueries(par, query):
    from collections import defaultdict

    n = len(par)

    # Step 1: Build tree
    children = defaultdict(list)
    root = -1

    for i in range(n):
        if par[i] == -1:
            root = i + 1  # nodes are 1-based
        else:
            children[par[i]].append(i + 1)

    # Step 2: DFS pre-order
    order = []
    tin = {}
    subtree_size = {}

    def dfs(node):
        tin[node] = len(order)
        order.append(node)

        size = 1
        for child in children[node]:
            size += dfs(child)

        subtree_size[node] = size
        return size

    dfs(root)

    # Step 3: Process queries
    answers = []

    for start, k in query:
        if start not in tin or k > subtree_size[start]:
            answers.append(-1)
        else:
            idx = tin[start] + k - 1
            answers.append(order[idx])

    return answers
