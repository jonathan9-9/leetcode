/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function (head) {
  /** fast and slow pointer --> if head.val does not equal second half (slow.val)
    return false, otherwise return true --> create helper fn reverseLinkedList
    to reverse SLL **/

  let fast = head;
  let slow = head;

  // slow is at mid when fast reaches end
  while (fast.next && fast.next.next) {
    slow = slow.next;
    fast = fast.next.next;
  }

  slow.next = reverseLinkedList(slow.next);
  slow = slow.next;

  while (slow !== null) {
    if (head.val !== slow.val) return false;

    head = head.next;
    slow = slow.next;
  }
  return true;

  function reverseLinkedList(head) {
    let prev = null;
    let next = null;

    while (head !== null) {
      next = head.next;

      head.next = prev;
      prev = head;

      head = next;
    }

    return prev;
  }
};
