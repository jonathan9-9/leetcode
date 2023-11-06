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

function insertInPosition(position, value) {
  if (position < 0 || position > this.length) {
    return "Incorrect value of position";
  }
  let node = new Node(value);

  if (position === 0) {
    node.next = this.head;
    this.head = node;
  } else {
    let current = this.head;
    let index = 0;
    let prev = null;

    while (index < position) {
      prev = current;
      current = current.next;
      index++;
    }

    prev.next = node;
    node.next = current;
  }
  this.length++;
}
