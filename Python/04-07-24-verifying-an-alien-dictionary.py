from typing import List


class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:

        order_string_lookup = {char: idx for idx, char in enumerate(order)}

        for prev_word, next_word in zip(words, words[1:]):
            if (
                prev_word > next_word
                and prev_word[: len(next_word)] == next_word  # noqa
            ):
                return False
            for char_prev_word, char_next_word in zip(prev_word, next_word):
                # break here; we have found previous word to be
                # in lexicographic order with its
                # consecutive word in the sequence
                # the index of prev word is less than the index of next word
                if (
                    order_string_lookup[char_prev_word]
                    < order_string_lookup[char_next_word]
                ):
                    break
                elif (
                    order_string_lookup[char_prev_word]
                    > order_string_lookup[char_next_word]
                ):
                    return False
        return True
