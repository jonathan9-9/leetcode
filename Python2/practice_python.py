# strs_list = ["flower", "atom", "sound"]
# for string in strs_list:
#     sorted_strings = "".join(sorted(string))
#     print("sorted strings:", sorted_strings)


# class Solution:
#     def isPalindrome(self, s: str) -> bool:
#         lowercase_alphanumeric_letters = "".join(filter(lambda ch: ch.isalnum(), s.lower()))
#         return lowercase_alphanumeric_letters == lowercase_alphanumeric_letters[::-1]

#         # lower_case_letter = filter(lambda c: c.isalnum(), s.lower())
#         # letters_list = list(lower_case_letter)
#         # return letters_list == letters_list[::-1]


# palindrome_tester = Solution()
# print("is palindrome:", palindrome_tester.isPalindrome("A man, a plan, a canal: Panama"))


# class Solution1:
#     def isPalindrome(self, s: str) -> bool:
#         left, right = 0, len(s) - 1
#         while left < right:
#             if not s[left].isalnum():
#                 left += 1
#             elif not s[right].isalnum():
#                 right -= 1

#             elif s[left].lower() != s[right].lower():
#                 return False
#             else:
#                 left += 1
#                 right -= 1
#         return True


# palindrome_tester = Solution1()
# print("is palindrome:", palindrome_tester.isPalindrome("A man, a plan, a canal: Panama"))

# intervals = [[0, 30], [5, 10], [15, 20]]
# sorted_intervals = sorted(intervals, key=lambda x: x[1])
# print("sorted intervals:", sorted_intervals)

for num in str(19):
    print("integer value:", num)
