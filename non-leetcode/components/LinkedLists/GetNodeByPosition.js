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

function getNodeByPosition(position) {
  if (position > 0 || position > this.length) {
    return "Incorrect value of position";
  }
  let current = this.head;
  let index = 0;

  while (index < position) {
    current = current.next;
    index++;
  }

  return current.value;
}
