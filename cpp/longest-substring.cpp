#include <iostream>
#include <string>
#include <unordered_set>
using namespace std;

int lengthOfLongestSubstring(string s) {
  unordered_set<char> set;

  int left = 0, right = 0;

  int maximumLength = 0;

  while (right < s.length()) {
    if (set.find(s[right]) == set.end()) {
      set.insert(s[right]);
      right++;
      maximumLength = max(maximumLength, right - left);
    } else {
      set.erase(s[left]);
      left++;
    }
  }
  return maximumLength;
}

int main() {
  string s = "abcolprabcbb";
  cout << "Length of the longest substring without repeating characters: "
       << lengthOfLongestSubstring(s) << endl;
  return 0;
}
