/* Given a string s containing just the characters '(', ')', '{', '}', '[',']'
determine if the input string is valid. An input string is valid if:
1. Open brackets must be closed by the same type of brackets
2. Open brackets must be closed in the correct order
3. Every close bracket has a corresponding open bracket of the same type
*/

var isValid = function (s) {
  const compare = "() {} []";

  let i = 0;
  const stack = [];

  while (i < s.length) {
    stack.push(s[i]);
    if (compare.includes(stack[stack.length - 2] + stack[stack.length - 1])) {
      console.log("Stack: ", stack);
      stack.pop();
      stack.pop();
    }
    i++;
  }

  return stack.length === 0;
};

isValid("() {} []");
