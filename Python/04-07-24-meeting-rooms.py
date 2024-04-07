# Given an array of meeting time intervals consisting of start
# and end times [[s1,e1],[s2,e2],...] (si < ei), determine
# if a person could attend all meetings.

# Input: intervals = [(0,30),(5,10),(15,20)]
# Output: false
# Explanation:
# (0,30), (5,10) and (0,30),(15,20) will conflict

# Input: intervals = [(5,8),(9,15)]
# Output: true
# Explanation:
# Two times will not conflict


"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""


class Solution:
    """
    @param intervals: an array of meeting time intervals
    @return: if a person could attend all meetings
    """

    # Solution 1

    def can_attend_meetings(self, intervals):
        intervals.sort(key=lambda x: x[0])

        for i in range(1, len(intervals)):
            if intervals[i][0] < intervals[i - 1][1]:
                return False
        return True

    # Solution 2 - to avoid name conflict
    def will_attend_meetings(self, intervals):
        for i, interval in enumerate(intervals):
            start, _ = interval

            if i > 0 and start < intervals[i - 1][1]:
                return False
        return True


solution = Solution()

res1 = solution.can_attend_meetings([(5, 8), (9, 15)])

print(f"should return true: {res1}")

res2 = solution.can_attend_meetings([(0, 30), (5, 10), (15, 20)])

print(f"should return false: {res2}")
