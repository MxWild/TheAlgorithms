package com.mxwild.sort.bubblesort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Bubble Sort")
public class BubbleSortTest {

  private static int[] notSortArray = {12, 54, 98, 45, 32, 85, 9, 122, 2};
  private static int[] sortedArray = {2, 9, 12, 32, 45, 54, 85, 98, 122};

  @Test
  public void bubbleSortTest() {
    SortUtils.print("Before sorted: ", notSortArray);
    BubbleSort.bubbleSort(notSortArray);
    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print("After sorted: ", notSortArray);
  }

}