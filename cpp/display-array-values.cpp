#include <iostream>
using namespace std;

int main() {

  // int arr[] = {3, 4, 7, 10};

  // // sizeof calculate the size of the array in bytes

  // // sizeof(arr) -> 5 elements * 4 bytes = 20
  // // size(arr) -> 1 element = 4 bytes
  // // 20 / 4 = 5
  // int ARRAY_SIZE = sizeof(arr) / sizeof(arr[0]);

  // for (int i = 0; i < ARRAY_SIZE; i++) {
  //   cout << arr[i] << " " << endl;
  // }
  // return 0;

  int numbers[5];
  // Get values for the array.

  cout << "Enter 5 values: " << endl;
  // we make the range variable num a reference variable to directly modify each
  // num or element in numbers array
  for (auto &num : numbers) {
    cin >> num;
  }
  // Display the values in the array.
  cout << "Here are the values you entered:\n";
  for (int val : numbers)
    cout << val << endl;

  return 0;
}
