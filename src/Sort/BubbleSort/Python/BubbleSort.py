def bubble_sort(arr):
    n = len(arr)

    for i in range(n):

        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


arr = [12, 43, 27, -10, 49, 15, 15]

bubble_sort(arr)

print("Bubble Sort array is:")
for i in range(len(arr)):
    print("%d" % arr[i])
