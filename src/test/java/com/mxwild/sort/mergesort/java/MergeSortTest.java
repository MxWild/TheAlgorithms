package com.mxwild.sort.mergesort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Merge Sort")
public class MergeSortTest {

  private static final int lengthArray = 10;

  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<MergeSort> constructor = MergeSort.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }

  @Test
  public void mergeSortTest() {
    int[] notSortArray = SortUtils.generateArray(lengthArray);
    SortUtils.print("Before sorted: ", notSortArray);

    int[] sortedArray = notSortArray.clone();
    Arrays.sort(sortedArray);

    MergeSort.mergeSort(notSortArray, lengthArray);

    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print("After sorted: ", notSortArray);
  }

}