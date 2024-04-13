# Definition for a Node.
from typing import Optional


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

        queue = [root]

        while queue:
            prev_node = None
            level_size = len(queue)

            for _ in range(level_size):
                node = queue.pop(0)

                if prev_node:
                    prev_node.next = node

                prev_node = node

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
        return root
