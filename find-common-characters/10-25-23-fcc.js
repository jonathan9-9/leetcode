var commonChars = function (words) {
  let charCount = new Map();

  for (let char of words[0]) {
    charCount.set(char, (charCount.get(char) || 0) + 1);
  }

  for (let i = 1; i < words.length; i++) {
    let wordCount = new Map();
    for (let char of words[i]) {
      wordCount.set(char, (wordCount.get(char) || 0) + 1);
    }

    for (let [char, count] of charCount) {
      if (wordCount.has(char)) {
        charCount.set(char, Math.min(count, wordCount.get(char)));
      } else {
        charCount.delete(char);
      }
    }
  }

  let result = [];

  for (let [char, count] of charCount) {
    for (let i = 0; i < count; i++) {
      result.push(char);
    }
  }

  return result;
};
