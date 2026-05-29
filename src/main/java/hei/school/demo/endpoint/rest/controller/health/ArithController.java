package school.hei.demo.endpoint.rest.controller.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.ArithService;

@RestController
@AllArgsConstructor
public class ArithController {
  private final ArithService arithService;

  @GetMapping("/add")
  public int add(int a, int b) {
    return arithService.add(a, b);
  }

  @GetMapping("/subtract")
  public int subtract(int a, int b) {
    return arithService.subtract(a, b);
  }

  @GetMapping("/multiply")
  public int multiply(int a, int b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public int divide(int a, int b) {
    return arithService.divide(a, b);
  }
}
