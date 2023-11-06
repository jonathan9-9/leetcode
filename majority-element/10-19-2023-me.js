var majorityElement = function (nums) {
  let countInt = {};
  for (let i = 0; i < nums.length; i++) {
    if (!countInt[nums[i]]) {
      countInt[nums[i]] = 0;
    }
    countInt[nums[i]]++;
  }

  for (const [key, value] of Object.entries(countInt)) {
    if (value > nums.length / 2) {
      return parseInt(key);
    }
  }
};

input = [2, 2, 1, 1, 1, 2, 2];

console.log(majorityElement(input));
