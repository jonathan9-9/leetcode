#include <iostream>
#include <vector>
using namespace std;

void modifyVector(vector<int> &nums) {
  nums.push_back(100); // Modifies the original vector
}

void modifyVectorByValue(vector<int> nums) {
  nums.push_back(100); // Modifies the local copy, original remains unchanged
}

int main() {
  vector<int> myVec = {1, 2, 3};

  // Pass by Value: makes a local copy of the vector but does not modify the
  // original vector so the values in myVec remain unchanged
  modifyVectorByValue(
      myVec); // Passing by value, original vector remains unchanged
  for (int i : myVec) {
    cout << i << " "; // Output: 1 2 3  (no further change)
  }
  cout << endl;

  // Pass by reference: modifies the original vector and appends 100 to the
  // end
  modifyVector(myVec); // Passing by reference, original vector gets modified
  for (int i : myVec) {
    cout << i << " "; // Output: 1 2 3 100
  }
  cout << endl;

  return 0;
}
