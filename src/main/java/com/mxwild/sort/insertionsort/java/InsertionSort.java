package com.mxwild.sort.insertionsort.java;

public class InsertionSort {

  private InsertionSort() {
    throw new IllegalStateException("InsertionSort class");
  }

  public static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      /* Move elements of arr[0 ... i - 1] that are
          greater than key? to one position ahead
          of their current position
       */
      while(j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j -= 1;
      }
      arr[j + 1] = key;
    }
  }

}
