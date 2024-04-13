from typing import Optional


# Definition for a Node.
class Node:
    def __init__(
        self,
        val: int = 0,
        left: "Node" = None,
        right: "Node" = None,
        next: "Node" = None,
    ):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:
    def connect(self, root: "Optional[Node]") -> "Optional[Node]":
        if not root:
            return root

        def join_nodes(node, level):

            if not node:
                return

            if level >= len(levels):
                levels.append(None)

            if levels[level]:
                levels[level].next = node

            levels[level] = node

            join_nodes(node.left, level + 1)
            join_nodes(node.right, level + 1)

        levels = []
        join_nodes(root, 0)

        return root
