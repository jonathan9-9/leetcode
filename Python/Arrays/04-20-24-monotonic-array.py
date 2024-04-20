def monotonic_array(array):
    # write code here
    if len(array) == 0:
        return True

    start = array[0]
    end = array[len(array) - 1]

    if start > end:
        for i in range(len(array) - 1):
            if array[i] < array[i + 1]:
                return False
    elif start == end:
        for i in range(len(array) - 1):
            if array[i] != array[i + 1]:
                return False
    else:
        for i in range(len(array) - 1):
            if array[i] > array[i + 1]:
                return False
    return True
