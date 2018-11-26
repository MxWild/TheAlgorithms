package com.mxwild.sort;

import com.mxwild.sort.bubblesort.java.BubbleSortTest;
import com.mxwild.sort.selectionsort.java.SelectionSortTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BubbleSortTest.class,
        SelectionSortTest.class
})
public class AllSortedTest {
}
