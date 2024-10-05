#include <iostream>
#include <queue>
#include <tuple>
#include <vector>

using namespace std;

int minObstaclesToRemove(vector<vector<char>> &board) {
  int rows = board.size();
  int cols = board[0].size();

  queue<tuple<int, int, int>> myQ;
  vector<vector<bool>> visited(rows, vector<bool>(cols, false));

  for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
      if (board[row][col] == '*') {
        myQ.push({row, col, 0});
        // mark cells as visited
        visited[row][col] = true;
      }
    }
  }

  vector<pair<int, int>> directions = {{1, 0}, {0, -1}, {0, 1}};

  while (!myQ.empty()) {
    auto [row, col, obstaclesRemoved] = myQ.front();
    myQ.pop();

    if (row == rows - 1) {
      return obstaclesRemoved;
    }

    for (const auto &[dRow, dCol] : directions) {
      int newRow = row + dRow;
      int newCol = col + dCol;

      if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols &&
          !visited[newRow][newCol]) {
        visited[newRow][newCol] = true;

        if (board[newRow][newCol] == '-') {
          myQ.push({newRow, newCol, obstaclesRemoved});
        } else if (board[newRow][newCol] == '#') {
          myQ.push({newRow, newCol, obstaclesRemoved + 1});
        }
      }
    }
  }
  return -1;
}

int main() {
  vector<vector<char>> matrix = {
      {'-', '-', '#', '-', '-'}, {'*', '#', '-', '#', '-'},
      {'#', '-', '#', '-', '-'}, {'#', '#', '-', '-', '-'},
      {'-', '-', '#', '#', '-'}, {'#', '-', '-', '-', '-'}};

  int result = minObstaclesToRemove(matrix);

  cout << "Minimum obstacles to remove: " << result << endl;

  return 0;
}
