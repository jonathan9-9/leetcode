// Recursively

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target, left = 0, right = nums.length - 1) {
  let mid = Math.floor((left + right) / 2);

  if (left > right) return -1;

  if (nums[mid] === target) {
    return mid;
  }

  if (nums[mid] > target) {
    return search(nums, target, left, mid - 1);
  } else {
    return search(nums, target, mid + 1, right);
  }
};

// binary search: while loop & recursion

// Iteratively

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
function search(nums, target) {
  let left = 0;
  let right = nums.length - 1;

  while (left <= right) {
    const mid = Math.floor((left + right) / 2);

    if (nums[mid] === target) {
      return mid;
    } else if (nums[mid] < target) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return -1;
}
