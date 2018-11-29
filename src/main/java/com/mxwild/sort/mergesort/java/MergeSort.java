package com.mxwild.sort.mergesort.java;

public class MergeSort {

  private MergeSort() {
    throw new UnsupportedOperationException("MergeSort class");
  }

  public static void mergeSort(int[] arr, int lengthArray) {
    if (lengthArray < 2) return;

    int middle = lengthArray / 2;
    int[] leftPart = new int[middle];
    int[] rightPart = new int[lengthArray - middle];

    for (int i = 0; i < middle; i++) {
      leftPart[i] = arr[i];
    }

    for (int i = middle; i < lengthArray; i++) {
      rightPart[i - middle] = arr[i];
    }

    mergeSort(leftPart, middle);
    mergeSort(rightPart, lengthArray - middle);

    merge(arr, leftPart, rightPart, middle, lengthArray - middle);
  }

  private static void merge(int[] arr, int[] leftPart, int[] rightPart, int left, int right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left && j < right) {
      if(leftPart[i] < rightPart[j]) {
        arr[k++] = leftPart[i++];
      } else {
          arr[k++] = rightPart[j++];
      }
    }

    while (i < left) {
      arr[k++] = leftPart[i++];
    }

    while (j < right) {
      arr[k++] = rightPart[j++];
    }
  }
}
