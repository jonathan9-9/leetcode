/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (matrix) {
  const result = [];

  // left to right
  while (matrix.length > 0) {
    result.push(...matrix.shift());

    // top to bottom
    for (let row of matrix) {
      if (row.length > 0) {
        result.push(row.pop());
      }
    }

    // right to left
    if (matrix.length > 0) {
      result.push(...matrix.pop().reverse());
    }

    // bottom to top
    for (let i = matrix.length - 1; i >= 0; i--) {
      if (matrix[i].length > 0) {
        result.push(matrix[i].shift());
      }
    }
  }

  return result;
};
