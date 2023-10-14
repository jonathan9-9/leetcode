def isPalindrome(self, x: int) -> bool:
    opp = ""
    for char in str(x):
        opp = char + opp

        if opp == str(x):
            return True
    return False
