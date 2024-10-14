#include <iostream>
using namespace std;

struct Node {
  int value;
  Node *left;
  Node *right;
  Node(int val) : value(val), left(nullptr), right(nullptr) {}
};

Node *searchBST(Node *root, int target) {
  if (root == nullptr) {
    return nullptr;
  }

  if (root->value == target) {
    return root;
  }

  if (target < root->value) {
    return searchBST(root->left, target);
  } else {
    return searchBST(root->right, target);
  }
}

int main() {
  // Create a simple binary search tree
  Node *root = new Node(10);
  root->left = new Node(5);
  root->right = new Node(15);
  root->left->left = new Node(2);
  root->left->right = new Node(7);
  root->right->left = new Node(12);
  root->right->right = new Node(17);

  int target = 11;
  Node *result = searchBST(root, target);

  if (result != NULL) {
    cout << "Found node with value: " << result->value << endl;
  } else {
    cout << "Value not found in the tree." << endl;
  }

  return 0;
}
