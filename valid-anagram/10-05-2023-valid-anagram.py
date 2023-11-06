def isAnagram(self, s: str, t: str) -> bool:
    sHashMap, tHashMap = {}, {}
    for char in s:
        if char in sHashMap:
            sHashMap[char] += 1
        else:
            sHashMap[char] = 1
    for letter in t:
        if letter in tHashMap:
            tHashMap[letter] += 1
        else:
            tHashMap[letter] = 1
    return sHashMap == tHashMap
