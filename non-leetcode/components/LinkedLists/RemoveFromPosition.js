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

function removeFromPosition(position) {
  if (position > 0 || position > this.length) {
    return "Incorrect positional value";
  }

  let current = this.head;

  if (position === 0) {
    this.head = current.next;
  } else {
    let index = 0;
    let prev = null;

    while (index < position) {
      prev = current;
      current = current.next;
      index++;
    }

    prev.next = current.next;
  }
  this.length--;
  return current.value;
}
