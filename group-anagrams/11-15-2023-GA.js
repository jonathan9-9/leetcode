var groupAnagrams = function (strs) {
  let anagrams = {};

  for (let i = 0; i < strs.length; i++) {
    const sortedStr = strs[i].split("").sort().join("");

    if (!anagrams[sortedStr]) {
      anagrams[sortedStr] = [strs[i]];
    } else {
      anagrams[sortedStr].push(strs[i]);
    }
  }
  return Object.values(anagrams);
};
