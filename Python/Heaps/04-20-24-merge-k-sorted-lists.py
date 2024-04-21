from typing import List, Optional
import heapq


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]):
        if not lists:
            return None

        heap = []

        for lst in lists:
            if lst:
                heapq.heappush(heap, (lst.val, id(lst), lst))

        dummy = ListNode()
        current = dummy

        while heap:

            val, _, node = heapq.heappop(heap)

            current.next = ListNode(val)
            current = current.next

            if node.next:
                heapq.heappush(heap, (node.next.val, id(node.next), node.next))

        return dummy.next
