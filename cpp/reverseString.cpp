#include <iostream>

void swapCharacters(char &a, char &b) {
  char temp = a;
  a = b;
  b = temp;
}

void reverseString(std::string &str) {
  int left = 0;
  int right = str.length() - 1;

  while (left < right) {
    swapCharacters(str[left], str[right]);
    left++;
    right--;
  }
}

int main() {

  std::string s = "milo"; // reversed: olleh

  reverseString(s);

  std::cout << "Reversed string: " << s << std::endl;
  return 0;
}
