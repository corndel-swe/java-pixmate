 package com.corndel.pixmate.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Test1A {

  //should return 20 for n=8
  @Test
  void testName() {
    assertEquals(addEven(8), 20);
  }

  //should return 0 for n=1
  @Test
  void testName() {
    assertEquals(addEven(1), 0);
  }

  //should handle a large number
  @Test
  void testName() {
    assertEquals(addEven(100), 2550);
  }

  //should return 2 for n=2
  @Test
  void testName() {
    assertEquals(addEven(2), 2);
  }

  //should handle odd numbers
  @Test
  void testName() {
    assertEquals(addEven(7), 12) // 2 + 4 + 6 = 12
  }

  //should handle even numbers
  @Test
  void testName() {
    assertEquals(addEven(10), 30) // 2 + 4 + 6 + 8 + 10 = 30
  }
}
