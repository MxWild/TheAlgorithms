package com.mxwild.sort.selectionsort.java;

public class SelectionSort {

//  public static void main(String[] args) {
//    SortUtils.print(arr);
//    selectionSort(arr);
//    System.out.println("Sorted array is:");
//    SortUtils.print(arr);
//  }

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
