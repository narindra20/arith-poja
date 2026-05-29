package hei.school.demo.endpoint.rest.controller.health;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import school.hei.demo.service.ArithService;

class ArithServiceTest {
  private final ArithService arithService = new ArithService();

  @Test
  void add_two_positive_numbers_should_return_their_sum() {
    var a = 5;
    var b = 10;

    var sum = arithService.add(a, b);

    assertEquals(15, sum);
  }

  @Test
  void add_negative_numbers_should_throw_exception() {
    var a = -5;
    var b = -10;

    assertThrows(IllegalArgumentException.class, () -> arithService.add(a, b));
  }

  @Test
  void subtract_two_positive_numbers_should_return_their_subtract() {
    var a = 10;
    var b = 3;

    var result = arithService.subtract(a, b);

    assertEquals(7, result);
  }

  @Test
  void subtract_negative_numbers_should_throw_exception() {
    var a = -10;
    var b = 3;

    assertThrows(IllegalArgumentException.class, () -> arithService.subtract(a, b));
  }

  @Test
  void multiply_two_positive_numbers_should_return_their_multiplication() {
    var a = 5;
    var b = 10;

    var multiplied = arithService.multiply(a, b);

    assertEquals(50, multiplied);
  }

  @Test
  void multiply_two_negative_numbers_should_return_their_multiplication() {
    var a = -5;
    var b = -10;

    var multiplied = arithService.multiply(a, b);

    assertEquals(50, multiplied);
  }

  @Test
  void multiply_negative_numbers_should_throw_exception() {
    var a = -5;
    var b = 10;

    assertThrows(IllegalArgumentException.class, () -> arithService.multiply(a, b));
  }

  @Test
  void divide_two_positive_numbers_should_return_their_division() {
    var a = 30;
    var b = 3;

    var result = arithService.divide(a, b);

    assertEquals(10, result);
  }

  @Test
  void divide_numbers_zero_should_throw_exception() {
    var a = 10;
    var b = 0;

    assertThrows(IllegalArgumentException.class, () -> arithService.divide(a, b));
  }
}
