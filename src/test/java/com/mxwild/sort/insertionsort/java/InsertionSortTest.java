package com.mxwild.sort.insertionsort.java;

import com.mxwild.sort.utils.SortUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Insertion Sort")
public class InsertionSortTest {

  private static final int lengthArray = 10;


  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<InsertionSort> constructor = InsertionSort.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }

  @Test
  public void insertionSort() {
    int[] notSortArray = SortUtils.generateArray(lengthArray);
    SortUtils.print("Before sorted: ", notSortArray);

    int[] sortedArray = notSortArray.clone();
    Arrays.sort(sortedArray);

    InsertionSort.insertionSort(notSortArray);
    assertArrayEquals(sortedArray, notSortArray);
    SortUtils.print("After sorted: ", notSortArray);
  }
}