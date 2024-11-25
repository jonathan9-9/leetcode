def strStr(self, haystack: str, needle: str) -> int:
    haystack_length = len(haystack)
    needle_length = len(needle)

    for left in range(haystack_length - needle_length + 1):
        if haystack[left:left + needle_length] == needle:
            return left
    return -1
