# Given two strings s and t, return true if t is an
# anagram
#  of s, and false otherwise.

def isAnagram(self, s, t):
    s_char = {}
    t_char = {}

    for char in s:
        if char in s_char:
            s_char[char] += 1
        else:
            s_char[char] = 1

    for char in t:
        if char in t_char:
            t_char[char] += 1
        else:
            t_char[char] = 1

    return s_char == t_char


s = "listen"
t = "silent"

print(isAnagram(None, s, t))  # Output: True
