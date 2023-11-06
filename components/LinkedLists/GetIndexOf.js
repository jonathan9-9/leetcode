class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.length = 0;
  }
}

function getIndexOf(value) {
  let current = this.head;
  let index = 0;

  while (current) {
    if (current.value === value) {
      return index;
    }
    current = current.next;
    index++;
  }
  return -1;
}

// checks whether linked list is empty
function isEmpty() {
  return this.length === 0;
}

// Print value of each node

function print() {
  let current = this.head;
  while (current) {
    console.log(current.value);
    current = current.next;
  }
}

// get Length

function getLength() {
  return this.length;
}
