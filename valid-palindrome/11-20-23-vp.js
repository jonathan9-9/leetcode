var isPalindrome = function (s) {
  if (s === null) return false;

  let left = 0;
  let right = s.length - 1;

  s = s.toLowerCase();

  while (left < right) {
    while (
      left < right &&
      !(
        (s[left] >= "a" && s[left] <= "z") ||
        (s[left] >= "0" && s[left] <= "9")
      )
    ) {
      left++;
    }
    while (
      left < right &&
      !(
        (s[right] >= "a" && s[right] <= "z") ||
        (s[right] >= "0" && s[right] <= "9")
      )
    ) {
      right--;
    }

    if (s[left] !== s[right]) {
      return false;
    }
    left++;
    right--;
  }

  return true;
};
