package com.mxwild.sort.selectionsort.java;

public class SelectionSort {

  private SelectionSort() {
    throw new IllegalStateException("SelectionSort class");
  }

  public static void selectionSort(int[] arr) {
    int minIndex;

    for (int i = 0; i < arr.length - 1; i++) {
      minIndex = i;

      for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }

      if (minIndex != i) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
      }
    }
  }

}
