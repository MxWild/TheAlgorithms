package com.mxwild.sort.selectionsort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Selection Sort")
public class SelectionSortTest {

  private static int[] notSortArray = {12, 54, 98, 45, 32, 85, 9, 122, 2};
  private static int[] sortedArray = {2, 9, 12, 32, 45, 54, 85, 98, 122};

  @Test
  public void selectionSortTest() {
    SortUtils.print("Before sorted: ", notSortArray);
    SelectionSort.selectionSort(notSortArray);
    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print("After sorted: ", notSortArray);
  }

}