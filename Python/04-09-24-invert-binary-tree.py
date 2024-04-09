# Definition for a binary tree node.
from collections import deque
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None

        # can also do queue = [root]
        queue = deque([root])

        while queue:
            # if above is done, also change to current_node = queue.pop(0)
            current_node = queue.popleft()

            current_node.left, current_node.right = (
                current_node.right,
                current_node.left,
            )

            if current_node.left:
                queue.append(current_node.left)
            if current_node.right:
                queue.append(current_node.right)

        return root


# Second solution invert binary tree recursively


class SecondSolution:
    def invertBinaryTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None

        root.left, root.right = root.right, root.left

        if root.left:
            self.invertBinaryTree(root.left)

        if root.right:
            self.invertBinaryTree(root.right)

        return root
