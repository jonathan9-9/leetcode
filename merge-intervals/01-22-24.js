/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function (intervals) {
  let mergedIntervals = [];
  intervals.sort((a, b) => a[0] - b[0]);

  if (intervals.length === 0) {
    return mergedIntervals;
  }

  let currentInterval = intervals[0];
  for (let i = 0; i < intervals.length; i++) {
    if (intervals[i][0] <= currentInterval[1]) {
      currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
    } else {
      mergedIntervals.push(currentInterval);
      currentInterval = intervals[i];
    }
  }
  mergedIntervals.push(currentInterval);

  return mergedIntervals;
};
