class Solution {
public:
  bool isValid(string s) {

    vector<char> list;

    for (auto &ch : s) {
      if (ch == '(' || ch == '[' || ch == '{') {
        list.push_back(ch);
      }

      else {
        if (list.empty() || ch == ')' && list.back() != '(' ||
            ch == '}' && list.back() != '{' ||
            ch == ']' && list.back() != '[') {
          return false;
        }
        list.pop_back();
      }
    }
    return list.empty();
  }
};
