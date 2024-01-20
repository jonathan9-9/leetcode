/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function (nums) {
  const output = [];

  const swap = (arr, i, j) => {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  };

  const generatePermutations = (startIndex, nums) => {
    if (startIndex === nums.length - 1) {
      output.push([...nums]);
      return;
    }

    for (let i = startIndex; i < nums.length; i++) {
      swap(nums, startIndex, i);
      generatePermutations(startIndex + 1, nums);
      swap(nums, startIndex, i); // Backtrack
    }
  };

  generatePermutations(0, nums);

  return output;
};
