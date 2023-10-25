// HARD

var trap = function (height) {
  let L = 0;
  let R = height.length - 1;
  let leftMax = height[L];
  let rightMax = height[R];
  let result = 0;
  while (L < R) {
    if (leftMax < rightMax) {
      L++;
      leftMax = Math.max(leftMax, height[L]);
      result += leftMax - height[L];
    } else {
      R--;
      rightMax = Math.max(rightMax, height[R]);
      result += rightMax - height[R];
    }
  }
  return result;
};
