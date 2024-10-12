#include <iostream>
#include <stack>
#include <unordered_map>

// SOLUTION 2

bool isValid(std::string s) {
  std::stack<char> stack;

  std::unordered_map<char, char> matching_brackets = {
      {')', '('}, {']', '['}, {'}', '{'}};

  for (char ch : s) {
    if (matching_brackets.count(ch)) {
      // if stack is empty (no corresponding opening bracket) OR if '(' does not
      // equal '(' then return false
      if (stack.empty() || stack.top() != matching_brackets[ch]) {
        return false;
      }
      stack.pop();
    } else {
      stack.push(ch);
    }
  }
  return stack.empty();
}

int main() {
  std::string s = "()[{}]";
  std::cout << (isValid(s) ? "true" : "false") << std::endl;
  return 0;
}

// SOLUTION 1

// bool isValid(string s) {

//   vector<char> list;

//   for (auto &ch : s) {
//     if (ch == '(' || ch == '[' || ch == '{') {
//       list.push_back(ch);
//     }

//     else {
//       if (list.empty() || (ch == ')' && list.back() != '(') ||
//           (ch == '}' && list.back() != '{') || (ch == ']' && list.back() !=
//           '[') {
//         return false;
//       }
//       list.pop_back();
//     }
//   }
//   return list.empty();
// }
