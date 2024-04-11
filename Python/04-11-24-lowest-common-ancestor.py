# Definition for a binary tree node.


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


# recursive solution
class Solution:
    def lowestCommonAncestor(
        self, root: "TreeNode", p: "TreeNode", q: "TreeNode"
    ) -> "TreeNode":

        if p.val > root.val and q.val > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        elif p.val < root.val and q.val < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        else:
            return root


# iterative solution
class SecondSolution:
    def lowestCommonAncestor(
        self, root: "TreeNode", p: "TreeNode", q: "TreeNode"
    ) -> "TreeNode":
        currentNode = root

        while currentNode is not None:
            if p.val < currentNode.val and q.val < currentNode.val:
                currentNode = currentNode.left
            elif p.val > currentNode.val and q.val > currentNode.val:
                currentNode = currentNode.right
            else:
                return currentNode
