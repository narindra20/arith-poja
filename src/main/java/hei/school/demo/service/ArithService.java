package hei.school.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

  public long add(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    return a + b;
  }

  public long subtract(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    return a - b;
  }

  public long multiply(long a, long b) {
    if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
      throw new IllegalArgumentException("a and b must have same sign");
    }
    return a * b;
  }

  public long divide(long a, long b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("a and b must be positive");
    }
    if (b == 0) {
      throw new IllegalArgumentException("b cannot be zero");
    }
    return a / b;
  }
}
