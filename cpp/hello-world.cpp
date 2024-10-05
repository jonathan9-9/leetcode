#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
  unordered_map<int, string> hashMap;

  hashMap[0] = "Apple";
  hashMap[1] = "Orange";
  hashMap[2] = "Watermelon";

  for (const auto &pair : hashMap) {
    cout << "Key: " << pair.first << ", Value: " << pair.second << endl;
  }
  return 0;
}
