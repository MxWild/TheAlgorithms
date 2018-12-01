package com.mxwild.sort.selectionsort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.mxwild.sort.utils.SortUtils.MESSAGE_AFTER;
import static com.mxwild.sort.utils.SortUtils.MESSAGE_BEFORE;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Selection Sort")
public class SelectionSortTest {

  private static final int lengthArray = 10;


  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<SelectionSort> constructor = SelectionSort.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }

  @Test
  public void selectionSortTest() {
    int[] notSortArray = SortUtils.generateArray(lengthArray);
    SortUtils.print(MESSAGE_BEFORE, notSortArray);

    int[] sortedArray = notSortArray.clone();
    Arrays.sort(sortedArray);

    SelectionSort.selectionSort(notSortArray);
    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print(MESSAGE_AFTER, notSortArray);
  }

}