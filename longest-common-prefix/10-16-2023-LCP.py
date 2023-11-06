def longestCommonPrefix(self, strs: [str]) -> str:
    prefix = ""
    if len(strs) == 0:
        return prefix
    for i in range(len(strs[0])):
        for string in strs:
            if i == len(string) or string[i] != strs[0][i]:
                return prefix
        prefix += strs[0][i]

    return prefix
