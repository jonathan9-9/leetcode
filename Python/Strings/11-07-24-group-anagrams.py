from collections import defaultdict


def groupAnagrams(strs):
    anagrams_list = defaultdict(list)

    for string in strs:
        sorted_string = ''.join(sorted(string))

        anagrams_list[sorted_string].append(string)

    return list(anagrams_list.values())


print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


# def groupAnagrams(strs):
#     anagrams_list = {}

#     result = []
#     for string in strs:
#         sorted_string = ''.join(sorted(string))
#         if sorted_string not in anagrams_list:
#             anagrams_list[sorted_string] = []

#         anagrams_list[sorted_string].append(string)

#     for group in anagrams_list.values():
#         result.append(group)
#     return result


# print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
