package school.hei.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {
  public int add(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    return a + b;
  }

  public int subtract(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    return a - b;
  }

  public int multiply(int a, int b) {
    if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
      throw new IllegalArgumentException("a and b must have same sign");
    }
    return a * b;
  }

  public int divide(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    if (b == 0) {
      throw new IllegalArgumentException("b cannot be zero");
    }
    return a / b;
  }
}
