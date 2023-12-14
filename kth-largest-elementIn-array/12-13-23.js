/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */

var findKthLargest = function (nums, k) {
  const maxHeap = new MaxHeap(nums);

  for (let i = 0; i < k - 1; i++) {
    maxHeap.extractMax();
  }

  return maxHeap.peek();
};

class MaxHeap {
  constructor(arr) {
    this.heap = arr;
    this.buildHeap();
  }

  buildHeap() {
    const n = this.heap.length;
    for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
      this.heapifyDown(i, n);
    }
  }

  heapifyDown(index, heapSize) {
    const leftChild = 2 * index + 1;
    const rightChild = 2 * index + 2;
    let largest = index;

    if (leftChild < heapSize && this.heap[leftChild] > this.heap[largest]) {
      largest = leftChild;
    }

    if (rightChild < heapSize && this.heap[rightChild] > this.heap[largest]) {
      largest = rightChild;
    }

    if (largest !== index) {
      [this.heap[largest], this.heap[index]] = [
        this.heap[index],
        this.heap[largest],
      ];
      this.heapifyDown(largest, heapSize);
    }
  }

  extractMax() {
    const n = this.heap.length;
    const max = this.heap[0];
    this.heap[0] = this.heap[n - 1];
    this.heap.pop();
    this.heapifyDown(0, this.heap.length);
    return max;
  }

  peek() {
    return this.heap[0];
  }
}
