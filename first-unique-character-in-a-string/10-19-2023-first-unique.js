/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
  charCount = {};
  for (let i = 0; i < s.length; i++) {
    charCount[s[i]] = charCount[s[i]] + 1 || 1;
  }
  for (let i = 0; i < s.length; i++) {
    if (charCount[s[i]] === 1) {
      return i;
    }
  }
  return -1;
};
