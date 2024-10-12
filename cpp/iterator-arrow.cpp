#include <iostream>
#include <vector>
using namespace std;

struct Point {
  int x;
  int y;
};

int main() {
  vector<Point> points = {{1, 2}, {3, 4}, {5, 6}};

  for (auto it = points.begin(); it != points.end(); it++) {
    cout << "x: " << it->x << " " << "y: " << it->y << endl;
  }

  return 0;
}
