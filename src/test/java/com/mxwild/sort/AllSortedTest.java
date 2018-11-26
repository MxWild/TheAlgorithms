package com.mxwild.sort;

import com.mxwild.sort.bubblesort.java.BubbleSortTest;
import com.mxwild.sort.selectionsort.java.SelectionSortTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        BubbleSortTest.class,
        SelectionSortTest.class
})
public class AllSortedTest {
}
