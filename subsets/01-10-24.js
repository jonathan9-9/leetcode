/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function (nums) {
  let ans = [];

  function recurse(initialPath, currSubset) {
    ans.push(currSubset.slice());

    for (let i = initialPath; i < nums.length; i++) {
      currSubset.push(nums[i]);
      recurse(i + 1, currSubset);
      currSubset.pop();
    }
  }

  recurse(0, []);

  return ans;
};
