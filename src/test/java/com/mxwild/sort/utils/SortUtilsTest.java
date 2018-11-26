package com.mxwild.sort.utils;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortUtilsTest {

  @Test
  public void constructor() {

    assertThrows(UnsupportedOperationException.class, () -> {
      Constructor<SortUtils> constructor = SortUtils.class.getDeclaredConstructor();
      constructor.setAccessible(true);
      try {
        constructor.newInstance();
      } catch (InvocationTargetException e) {
        throw (UnsupportedOperationException) e.getTargetException();
      }
    });
  }

}