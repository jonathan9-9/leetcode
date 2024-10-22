# Longer version of enumerate()
names = ["Alice", "Bob", "Charlie"]

# Manual enumerate implementation
enumerated_manual = []
index = 0
for name in names:
    enumerated_manual.append((index, name))
    index += 1

print(enumerated_manual)
