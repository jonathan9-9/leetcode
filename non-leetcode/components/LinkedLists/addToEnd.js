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

function addToTheEnd(value) {
  let node = new Node(value);

  if (this.length === 0) {
    this.head = node;
  } else {
    let current = this.head;

    while (current.next) {
      current = current.next;
    }

    current.next = new Node(value); // adds the new node to the end of the linked list
  }
  this.length++;
}
