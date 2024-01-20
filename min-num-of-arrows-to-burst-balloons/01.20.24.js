/**
 * @param {number[][]} points
 * @return {number}
 */
var findMinArrowShots = function (points) {
  if (!points.length) return 0;

  sortedIntervals = points.sort((a, b) => a[1] - b[1]);

  let arrows = 1;
  let endOfInterval = points[0][1];

  for (let i = 1; i < sortedIntervals.length; i++) {
    let interval = points[i];
    if (interval[0] > endOfInterval) {
      arrows++;
      endOfInterval = interval[1];
    }
  }

  return arrows;
};
