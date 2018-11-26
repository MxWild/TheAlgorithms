package com.mxwild.sort.utils;

import java.util.Arrays;

public class SortUtils {

  private SortUtils() {
    throw new IllegalStateException("SortUtils class");
  }

  public static void print(String message, int[] array){
    System.out.println(message + Arrays.toString(array));
  }

}
