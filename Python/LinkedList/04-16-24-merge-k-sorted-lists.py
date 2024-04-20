from typing import List, Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]):
        if not lists:
            return None
        elif len(lists) == 1:
            return lists[0]
        else:
            mid = len(lists) // 2
            left = self.mergeKLists(lists[:mid])
            right = self.mergeKLists(lists[mid:])
            return self.merge_two_lists(left, right)

    def merge_two_lists(self, lst1, lst2):
        if not lst1:
            return lst2
        elif not lst2:
            return lst1
        elif lst1.val < lst2.val:
            lst1.next = self.merge_two_lists(lst1.next, lst2)
            return lst1
        else:
            lst2.next = self.merge_two_lists(lst1, lst2.next)
            return lst2
