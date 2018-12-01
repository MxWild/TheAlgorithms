package com.mxwild.sort.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

public class SortUtils {

  private static final Logger LOGGER = LoggerFactory.getLogger(SortUtils.class);
  public static final String MESSAGE_BEFORE = "Before sorted: {}";
  public static final String MESSAGE_AFTER = "After sorted: {}";

  public static final int LENGTH_ARRAY = 10;

  private SortUtils() {
    throw new UnsupportedOperationException("SortUtils class");
  }

  public static void print(String message, int[] array){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Arrays.toString(array));
    LOGGER.info(message, stringBuilder);
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
