/**
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function (stones) {
  const maxHeap = new MaxHeap(stones);

  while (maxHeap.size() > 1) {
    const heaviest1 = maxHeap.extractMax();
    const heaviest2 = maxHeap.extractMax();

    if (heaviest1 !== heaviest2) {
      maxHeap.insert(heaviest1 - heaviest2);
    }
  }

  return maxHeap.size() === 1 ? maxHeap.peek() : 0;
};

class MaxHeap {
  constructor(arr = []) {
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

  insert(val) {
    this.heap.push(val);
    this.buildHeap();
  }

  peek() {
    return this.heap[0];
  }

  size() {
    return this.heap.length;
  }
}
