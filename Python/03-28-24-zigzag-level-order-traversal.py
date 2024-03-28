from collections import deque
from typing import List, Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []

        result = []
        level_count = 0

        q = deque([root])

        while q:
            current_level = []
            current_size = len(q)

            for _ in range(current_size):

                if level_count % 2 == 0:
                    current_node = q.popleft()
                    if current_node.left:
                        q.append(current_node.left)
                    if current_node.right:
                        q.append(current_node.right)

                else:
                    current_node = q.pop()

                    if current_node.right:
                        q.appendleft(current_node.right)
                    if current_node.left:
                        q.appendleft(current_node.left)

                current_level.append(current_node.val)

            level_count += 1

            result.append(current_level)

        return result
