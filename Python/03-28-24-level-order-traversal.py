from collections import deque
from typing import List, Optional

# Definition for a binary tree node.


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        # using deque and its popleft method is more efficient O(1) constant

        # time complexity compared to the pop(0) method, linear time

        if not root:
            return []

        result = []
        queue = deque([root])

        while queue:
            current_level = []
            level_size = len(queue)

            for _ in range(level_size):
                node = queue.popleft()
                current_level.append(node.val)

                if node.left:
                    queue.append(node.left)

                if node.right:
                    queue.append(node.right)

            result.append(current_level)

        return result
