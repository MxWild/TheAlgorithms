package com.mxwild.sort.mergesort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.mxwild.sort.utils.SortUtils.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Merge Sort")
public class MergeSortTest {

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
    int[] notSortArray = SortUtils.generateArray(LENGTH_ARRAY);
    SortUtils.print(MESSAGE_BEFORE, notSortArray);

    int[] sortedArray = notSortArray.clone();
    Arrays.sort(sortedArray);

    MergeSort.mergeSort(notSortArray, LENGTH_ARRAY);

    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print(MESSAGE_AFTER, notSortArray);
  }

}