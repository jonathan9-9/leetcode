#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
  unordered_map<string, int> ageMap;
  ageMap["Alice"] = 25;
  ageMap["Bob"] = 30;
  ageMap["Charlie"] = 22;

  std::string sub = std::string("aec").substr(2);
  cout << "sub: " << sub << endl;

  // Iterating through the unordered_map
  for (const auto &pair : ageMap) {
    cout << pair.first << ": " << pair.second << endl;
  }

  return 0;
}
