def selection_sort(array):
    minIndex = array[0]

    for i in range(array):
        minIndex = array[i]

        for j in range(i + 1,len(array)):
            if array[j] < array[minIndex]:
                minIndex = j



arr = [12, 43, 27, -10, 49, 15, 15]

selection_sort(arr)

print("Selected Sort array is:")
for i in range(len(arr)):
    print("%d" % arr[i])
