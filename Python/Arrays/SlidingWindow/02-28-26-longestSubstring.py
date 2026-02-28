def longestSubstringWithoutRepeatingCharacters(s):
    # create a set
    char_set = set()
    left = 0
    max_length = 0
    for right in range(len(s)):
        while s[right] in char_set:
            char_set.remove(s[left])
            left += 1
        char_set.add(s[right])
        max_length = max(max_length, right - left + 1)
    return max_length


# Test case 1: "abcabcbb" -> Output: 3 (The longest substring without repeating characters is "abc")
print(longestSubstringWithoutRepeatingCharacters("abcabcbb"))
# Test case 2: "bbbbb" -> Output: 1 (The longest substring without repeating characters is "b")
print(longestSubstringWithoutRepeatingCharacters("bbbbb"))
