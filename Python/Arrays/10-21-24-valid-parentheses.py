
def isValid(self, s: str) -> bool:
    stack = []  # Create an empty stack to keep track of open brackets.

    bracket_mapping = {')': '(', '}': '{', ']': '['}

    for char in s:
        # Checks if closing bracket is a key in the dictionary
        # otherwise it's an open bracket to add to the stack
        if char in bracket_mapping:
            if stack:
                prev_open_bracket = stack.pop()
            else:
                prev_open_bracket = None

            if prev_open_bracket is None:
                return False

    # Compares if the opening bracket that the current closing bracket maps
    #  to is not equal to the corresponding opening bracket in the stack
    # Ex: compares '(' to '('
            if bracket_mapping[char] != prev_open_bracket:
                return False
        else:
            stack.append(char)  # Append the opening bracket into the stack

    return not stack


# s = "()[]{}"
s = "(]"

print(isValid(None, s))
