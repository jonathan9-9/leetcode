/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
class ListNode {
  constructor(val, next = null) {
    this.val = val;
    this.next = next;
  }
}

function mergeKLists(lists) {
  const minHeap = new MinHeap();

  // Add the first node of each list to the heap
  for (const list of lists) {
    if (list) {
      minHeap.insert(list);
    }
  }

  let dummy = new ListNode();
  let current = dummy;

  while (!minHeap.isEmpty()) {
    const node = minHeap.extractMin();
    current.next = node;
    current = current.next;

    if (node.next) {
      minHeap.insert(node.next);
    }
  }

  return dummy.next;
}

class MinHeap {
  constructor() {
    this.heap = [];
  }

  insert(node) {
    this.heap.push(node);
    this.heapifyUp();
  }

  extractMin() {
    if (this.isEmpty()) {
      return null;
    }

    const min = this.heap[0];
    const last = this.heap.pop();

    if (this.heap.length > 0) {
      this.heap[0] = last;
      this.heapifyDown();
    }

    return min;
  }

  isEmpty() {
    return this.heap.length === 0;
  }

  heapifyUp() {
    let currentIndex = this.heap.length - 1;

    while (currentIndex > 0) {
      const parentIndex = Math.floor((currentIndex - 1) / 2);

      if (this.heap[currentIndex].val < this.heap[parentIndex].val) {
        [this.heap[currentIndex], this.heap[parentIndex]] = [
          this.heap[parentIndex],
          this.heap[currentIndex],
        ];
        currentIndex = parentIndex;
      } else {
        break;
      }
    }
  }

  heapifyDown() {
    let currentIndex = 0;

    while (true) {
      let leftChildIndex = 2 * currentIndex + 1;
      let rightChildIndex = 2 * currentIndex + 2;
      let smallestIndex = currentIndex;

      if (
        leftChildIndex < this.heap.length &&
        this.heap[leftChildIndex].val < this.heap[smallestIndex].val
      ) {
        smallestIndex = leftChildIndex;
      }

      if (
        rightChildIndex < this.heap.length &&
        this.heap[rightChildIndex].val < this.heap[smallestIndex].val
      ) {
        smallestIndex = rightChildIndex;
      }

      if (currentIndex !== smallestIndex) {
        [this.heap[currentIndex], this.heap[smallestIndex]] = [
          this.heap[smallestIndex],
          this.heap[currentIndex],
        ];
        currentIndex = smallestIndex;
      } else {
        break;
      }
    }
  }
}
