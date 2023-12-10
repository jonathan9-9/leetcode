/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {
  let prev = null;
  let next = null;

  while (head) {
    // stores the reference to the next node in the original list
    next = head.next;

    // moves pointer to the previous node to reverse the list
    head.next = prev;

    // previous node now points to the new head of the reversed list
    prev = head;

    // head is assigned to next or (head.next) in order to traverse the original list
    // the next variable stores head.next so in other words head = head.next
    head = next;
  }

  return prev;
};
