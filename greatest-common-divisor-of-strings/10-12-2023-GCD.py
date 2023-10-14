def gcdOfStrings(str1: str, str2: str) -> str:
    if len(str1) < len(str2):
        return gcdOfStrings(str2, str1)

    if not str1.startswith(str2):
        return ""

    if len(str2) == 0:
        return str1

    return gcdOfStrings(str1[len(str2):], str2)

# Output: ABC


print(gcdOfStrings("ABCABC", "ABC"))
