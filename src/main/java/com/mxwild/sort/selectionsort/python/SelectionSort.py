def selection_sort(array):
    for i in range(len(array) - 1, 0, -1):
        position_of_max = 0

        for loc in range(1, i + 1):
            if array[loc] > array[position_of_max]:
                position_of_max = loc

        temp = array[i]
        array[i] = array[position_of_max]
        array[position_of_max] = temp


arr = [12, 43, 27, -10, 49, 15, 15]

selection_sort(arr)

print("Selected Sort array is:")
for i in range(len(arr)):
    print("%d" % arr[i])
