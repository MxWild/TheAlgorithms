package com.mxwild.sort.bubblesort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Bubble Sort")
public class BubbleSortTest {

  private static final int lengthArray = 10;

  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<BubbleSort> constructor = BubbleSort.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }


  @Test
  public void bubbleSortTest() {
    int[] notSortArray = SortUtils.generateArray(lengthArray);
    SortUtils.print("Before sorted: ", notSortArray);

    int[] sortedArray = notSortArray;
    Arrays.sort(sortedArray);

    BubbleSort.bubbleSort(notSortArray);

    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print("After sorted: ", notSortArray);
  }

}