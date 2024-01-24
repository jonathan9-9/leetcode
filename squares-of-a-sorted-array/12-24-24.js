/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
  let squaredArr = [];
  let end = nums.length - 1;
  let idx = end;
  let start = 0;

  while (end > -1) {
    if (Math.abs(nums[start]) > Math.abs(nums[end])) {
      squaredArr[idx--] = nums[start] ** 2;
      start++;
    } else {
      squaredArr[idx--] = nums[end] ** 2;
      end--;
    }
  }

  return squaredArr;
};
