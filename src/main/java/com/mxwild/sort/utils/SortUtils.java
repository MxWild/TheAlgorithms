package com.mxwild.sort.utils;

import java.util.Arrays;
import java.util.Random;

public class SortUtils {

  private SortUtils() {
    throw new UnsupportedOperationException("SortUtils class");
  }

  public static void print(String message, int[] array){
    System.out.println(message + Arrays.toString(array));
  }

  public static int[] generateArray(int lengthArray){
    Random random = new Random();
    int[] result = new int[lengthArray];

    for (int i = 0; i < result.length; i++) {
      result[i] = random.nextInt(255) + 1;
    }

    return result;
  }

}
