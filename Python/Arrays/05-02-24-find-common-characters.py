from typing import List


class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        commonLettersArr = []

        commonCharsFirstWord = {}

        for char in words[0]:
            commonCharsFirstWord[char] = commonCharsFirstWord.get(char, 0) + 1

        for word in words[1:]:
            commonCharsOtherWords = {}
            for char in word:
                commonCharsOtherWords[char] = (
                    commonCharsOtherWords.get(char, 0) + 1
                )  # noqa

            for char in list(commonCharsFirstWord):
                if char in commonCharsOtherWords:
                    commonCharsFirstWord[char] = min(
                        commonCharsFirstWord[char], commonCharsOtherWords[char]
                    )
                else:
                    del commonCharsFirstWord[char]

        for char, count in commonCharsFirstWord.items():
            commonLettersArr.extend([char] * count)

        return commonLettersArr
