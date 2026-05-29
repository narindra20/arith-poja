package hei.school.demo.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.*;

import hei.school.demo.service.ArithService;
import org.junit.jupiter.api.Test;

class ArithServiceTest {

  private final ArithService arithService = new ArithService();

  @Test
  void add_two_positive_numbers_should_return_their_sum() {
    long a = 5L;
    long b = 10L;

    long sum = arithService.add(a, b);

    assertEquals(15L, sum);
  }

  @Test
  void add_negative_numbers_should_throw_exception() {
    long a = -5L;
    long b = -10L;

    assertThrows(IllegalArgumentException.class, () -> arithService.add(a, b));
  }

  @Test
  void add_large_numbers_should_return_their_sum() {
    long a = 10_000_000_000L;
    long b = 20_000_000_000L;

    long sum = arithService.add(a, b);

    assertEquals(30_000_000_000L, sum);
  }

  @Test
  void subtract_two_positive_numbers_should_return_their_subtract() {
    long a = 10L;
    long b = 3L;

    long result = arithService.subtract(a, b);

    assertEquals(7L, result);
  }

  @Test
  void subtract_negative_numbers_should_throw_exception() {
    long a = -10L;
    long b = 3L;

    assertThrows(IllegalArgumentException.class, () -> arithService.subtract(a, b));
  }

  @Test
  void multiply_two_positive_numbers_should_return_their_multiplication() {
    long a = 5L;
    long b = 10L;

    long multiplied = arithService.multiply(a, b);

    assertEquals(50L, multiplied);
  }

  @Test
  void multiply_two_negative_numbers_should_return_their_multiplication() {
    long a = -5L;
    long b = -10L;

    long multiplied = arithService.multiply(a, b);

    assertEquals(50L, multiplied);
  }

  @Test
  void multiply_negative_numbers_should_throw_exception() {
    long a = -5L;
    long b = 10L;

    assertThrows(IllegalArgumentException.class, () -> arithService.multiply(a, b));
  }

  @Test
  void divide_two_positive_numbers_should_return_their_division() {
    long a = 30L;
    long b = 3L;

    long result = arithService.divide(a, b);

    assertEquals(10L, result);
  }

  @Test
  void divide_numbers_zero_should_throw_exception() {
    long a = 10L;
    long b = 0L;

    assertThrows(IllegalArgumentException.class, () -> arithService.divide(a, b));
  }
}
