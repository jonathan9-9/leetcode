/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */

var topKFrequent = function (nums, k) {
  // use a frequency hash map to keep track of occurrences of elements
  // construct the heap
  // use a max heap to store top k frequent element at root node
  // ensure heap size does not exceed k
  // add to the front of array/heap top k frequent elements

  class maxHeap {
    constructor() {
      this.heap = [];
    }

    heapify() {
      const n = this.heap.length;
      for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
        this.heapifyDown(i, n);
      }
    }

    heapifyDown(index, heapsize) {
      const leftNode = 2 * index + 1;
      const rightNode = 2 * index + 2;
      let largest = index;
      if (
        leftNode < heapsize &&
        this.heap[leftNode][1] > this.heap[largest][1]
      ) {
        largest = leftNode;
      }
      if (
        rightNode < heapsize &&
        this.heap[rightNode][1] > this.heap[largest][1]
      ) {
        largest = rightNode;
      }
      if (largest !== index) {
        [this.heap[largest], this.heap[index]] = [
          this.heap[index],
          this.heap[largest],
        ];
        this.heapifyDown(largest, heapsize);
      }
    }

    extractMax() {
      let n = this.heap.length;
      const max = this.heap[0];
      this.heap[0] = this.heap[n - 1];
      this.heap.pop();
      this.heapifyDown(0, n - 1);
      return max;
    }

    insert(item) {
      this.heap.push(item);
      this.heapify();
    }
  }

  let occurrences = {};

  for (let num of nums) {
    occurrences[num] = (occurrences[num] || 0) + 1;
  }

  const topKHeap = new maxHeap();
  for (let key in occurrences) {
    topKHeap.insert([key, occurrences[key]]);
  }

  topKHeap.heapify();

  let res = [];
  while (k > 0) {
    res.unshift(topKHeap.extractMax()[0]);
    k--;
  }

  return res;
};
