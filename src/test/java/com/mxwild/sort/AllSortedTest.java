package com.mxwild.sort;

import com.mxwild.sort.bubblesort.java.BubbleSortTest;
import com.mxwild.sort.insertionsort.java.InsertionSortTest;
import com.mxwild.sort.mergesort.java.MergeSortTest;
import com.mxwild.sort.quicksort.java.QuickSortTest;
import com.mxwild.sort.selectionsort.java.SelectionSortTest;
import com.mxwild.sort.utils.SortUtilsTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        SortUtilsTest.class,
        BubbleSortTest.class,
        SelectionSortTest.class,
        InsertionSortTest.class,
        MergeSortTest.class,
        QuickSortTest.class
})
public class AllSortedTest {
}
