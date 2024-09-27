#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
  unordered_map<int, string> hashMap;

  hashMap[1] = "Apple";
  hashMap[2] = "Orange";
  hashMap[3] = "Watermelon";

  unordered_map<int, string>::iterator it;
  for (it = hashMap.begin(); it != hashMap.end(); ++it) {
    cout << "Key: " << it->first << ", Value: " << it->second << endl;
  }

  // for (const auto &pair : hashMap) {
  //   cout << "Key: " << pair.first << ", Value: " << pair.second << endl;
  // }
  return 0;
}
