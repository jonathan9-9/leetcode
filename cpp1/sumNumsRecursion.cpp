#include <iostream>
using namespace std;

int recursiveSum(int arr[], int size) {
  // Base case: If size is 0, return 0
  if (size == 0) {
    return 0;
  }
  // Recursive case: Add the last element to the sum of the rest
  return arr[size - 1] + recursiveSum(arr, size - 1);
}

int main() {
  int arr[] = {1, 2, 3, 4, 5};
  int size = sizeof(arr) / sizeof(arr[0]);

  int sum = recursiveSum(arr, size);
  cout << "The sum of the array elements is: " << sum << endl;

  return 0;
}
