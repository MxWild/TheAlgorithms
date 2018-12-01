package com.mxwild.sort.quicksort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.mxwild.sort.utils.SortUtils.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Quick Sort")
public class QuickSortTest {

  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<QuickSort> constructor = QuickSort.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }

  @Test
  public void quickSort() {
    int[] notSortArray = SortUtils.generateArray(LENGTH_ARRAY);
    SortUtils.print(MESSAGE_BEFORE, notSortArray);

    int[] sortedArray = notSortArray.clone();
    Arrays.sort(sortedArray);

    QuickSort.quickSort(notSortArray, 0, LENGTH_ARRAY - 1);

    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print(MESSAGE_AFTER, notSortArray);
  }
}