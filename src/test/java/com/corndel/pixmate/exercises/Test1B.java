 package com.corndel.pixmate.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Test1B {

  //should return the sum of all numbers in an array
  @Test
  void testName() {
    assertEquals(sumArray(new int[] {1, 2, 3, 4, 5}), 15);
    assertEquals(sumArray(new int[] {10, -2, 3}), 11);
  }

  //should return 0 for an empty array
  @Test
  void testName() {
    assertEquals(sumArray(new int[] {}), 0);
  }

  //should handle arrays with negative numbers
  @Test
  void testName() {
    assertEquals(sumArray(new int[] {-1, -2, -3, -4, -5}), -15);
  }

  //should return the number itself for single-element arrays
  @Test
  void testName() {
    assertEquals(sumArray(new int[] {5}), 5);
    assertEquals(sumArray(new int[] {-10}), -10);
  }

  //should handle large arrays
  @Test
  void testName() {
    var largeArray = Array.from({ length: 100 }, (_, i) => i + 1);
    var expectedSum = largeArray.reduce((a, b) => a + b, 0);
    assertEquals(sumArray(largeArray), expectedSum);
  }

  // Add more test cases as needed
}
