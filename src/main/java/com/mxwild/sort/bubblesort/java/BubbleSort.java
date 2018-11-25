package com.mxwild.sort.bubblesort.java;

import com.mxwild.sort.utils.SortUtils;

public class BubbleSort {

  private static int[] arr = {12, 54, 98, 45, 32, 85, 9, 122, 2};


  public static void main(String[] args) {
    bubbleSort(arr);
    System.out.println("Sorted array is: ");
    SortUtils.print(arr);
  }

  private static void bubbleSort(int[] arr) {

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