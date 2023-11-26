var isValid = function (s) {
  const compare = "() {} []";
  let i = 0;
  const stack = [];

  while (i < s.length) {
    stack.push(s[i]);
    if (compare.includes(stack[stack.length - 2] + stack[stack.length - 1])) {
      stack.pop();
      stack.pop();
    }
    i++;
  }

  return stack.length === 0;
};
