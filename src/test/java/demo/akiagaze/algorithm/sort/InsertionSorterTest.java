package demo.akiagaze.algorithm.sort;

import demo.akiagaze.algorithm.constant.Sort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSorterTest {
  @Test
  public void test_sort_an_int_array_asc_as_default_1() {
    InsertionSorter sorter = new InsertionSorter();
    sorter.setLoggable(true);
    int[] array = new int[]{21, 4, 34, 8, 11, 9, 5, 14, 25, 11, 20, 36, 3, 1, 19, 8, 24};
    int[] expected = {1, 3, 4, 5, 8, 8, 9, 11, 11, 14, 19, 20, 21, 24, 25, 34, 36};

    sorter.insertionSort(array);

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_an_int_array_asc_as_default_2() {
    InsertionSorter sorter = new InsertionSorter();
    sorter.setLoggable(true);
    int[] array = new int[]{1, 3, 4, 5, 8, 8, 9, 11, 11, 14, 19, 20, 21, 28, 25, 34, 36};
    sorter.insertionSort(array);

    int[] expected = {1, 3, 4, 5, 8, 8, 9, 11, 11, 14, 19, 20, 21, 25, 28, 34, 36};

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_an_int_array_asc_as_default_3() {
    InsertionSorter sorter = new InsertionSorter();
    sorter.setLoggable(true);
    int[] array = new int[]{36, 34, 25, 28, 21, 20, 19, 14, 11, 11, 9, 8, 8, 5, 4, 3, 1};
    sorter.insertionSort(array);

    int[] expected = {1, 3, 4, 5, 8, 8, 9, 11, 11, 14, 19, 20, 21, 25, 28, 34, 36};

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_an_int_array_with_direction_desc() {
    InsertionSorter sorter = new InsertionSorter();

    int[] array = new int[]{11, 4, 2, 9, 25, 7, 11, 36, 3, 21, 8, 34};
    int[] expected = new int[]{36, 34, 25, 21, 11, 11, 9, 8, 7, 4, 3, 2};

    sorter.insertionSort(array, Sort.Direction.DESC);

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_an_int_array_with_direction_asc() {
    InsertionSorter sorter = new InsertionSorter();

    int[] array = new int[]{11, 4, 2, 9, 25, 7, 11, 36, 3, 21, 8, 34};
    int[] expected = new int[]{2, 3, 4, 7, 8, 9, 11, 11, 21, 25, 34, 36};

    sorter.insertionSort(array, Sort.Direction.ASC);

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_for_any_element_type_which_implement_Comparable_1() {
    InsertionSorter sorter = new InsertionSorter();
    String[] array = new String[]{"ad", "2", "a", "!", "9", "x", "A", ","};
    String[] expected = new String[]{"!", ",", "2", "9", "A", "a", "ad", "x"};

    sorter.insertionSort(array);

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_for_any_element_type_which_implement_Comparable_2() {
    InsertionSorter sorter = new InsertionSorter();
    String[] array = new String[]{"ad", "2", "a", "!", "9", "x", "A", ","};
    String[] expected = new String[]{"x", "ad", "a", "A", "9", "2", ",", "!"};

    sorter.insertionSort(array, Sort.Direction.DESC);

    System.out.println(Arrays.toString(array));
    assertArrayEquals(expected, array);
  }

  @Test
  public void test_sort_for_collection_1() {
    InsertionSorter sorter = new InsertionSorter();
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "ad", "2", "a", "!", "9", "x", "A", ",");
    List<String> expected = Arrays.asList("x", "ad", "a", "A", "9", "2", ",", "!");

    sorter.insertionSort(list, Sort.Direction.DESC);

    System.out.println(list);
    assertEquals(expected, list);
  }

  @Test
  public void test_sort_for_collection_2() {
    InsertionSorter sorter = new InsertionSorter();
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "ad", "2", "a", "!", "9", "x", "A", ",");
    List<String> expected = Arrays.asList("!", ",", "2", "9", "A", "a", "ad", "x");

    sorter.insertionSort(list);

    System.out.println(list);
    assertEquals(expected, list);
  }
}