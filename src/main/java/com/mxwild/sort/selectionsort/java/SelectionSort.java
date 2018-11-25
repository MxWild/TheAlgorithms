package com.mxwild.sort.selectionsort.java;

import com.mxwild.sort.utils.SortUtils;

public class SelectionSort {

  private static int[] arr = {12, 54, 98, 45, 32, 85, 9, 122, 2};

  public static void main(String[] args) {
    SortUtils.print(arr);
    selectionSort(arr);
    System.out.println("Sorted array is:");
    SortUtils.print(arr);
  }

  private static void selectionSort(int[] arr) {
    int i, j, minIndex, tmp;
    int n = arr.length;

    for (i = 0; i < n - 1; i++) {
      minIndex = i;
      for (j = i + 1; j < n; j++)
        if (arr[j] < arr[minIndex])
          minIndex = j;
      if (minIndex != i) {
        tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
      }
    }
  }

}
