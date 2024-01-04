/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function (root, p, q) {
  if (!root || root === p || root === q) return root;

  const left = lowestCommonAncestor(root.left, p, q);
  const right = lowestCommonAncestor(root.right, p, q);

  if (left && right) return root;

  return left ? left : right;
};

// SECOND SOLUTION

var lowestCommonAncestor = function (root, p, q) {
  if (p.val > root.val && q.val > root.val)
    return lowestCommonAncestor(root.right, p, q);
  else if (p.val < root.val && q.val < root.val)
    return lowestCommonAncestor(root.left, p, q);
  else {
    return root;
  }
};
