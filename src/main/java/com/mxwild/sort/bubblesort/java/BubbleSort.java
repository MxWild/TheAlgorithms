package com.mxwild.sort.bubblesort.java;

public class BubbleSort {

  private BubbleSort() {
    throw new UnsupportedOperationException("BubbleSort class");
  }

  public static void bubbleSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if(arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }

  }
}
