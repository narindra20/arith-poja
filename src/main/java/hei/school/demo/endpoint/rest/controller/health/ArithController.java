package hei.school.demo.endpoint.rest.controller.health;

import hei.school.demo.service.ArithService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {

  private final ArithService arithService;

  @GetMapping("/add")
  public long add(@RequestParam long a, @RequestParam long b) {
    return arithService.add(a, b);
  }

  @GetMapping("/subtract")
  public long subtract(@RequestParam long a, @RequestParam long b) {
    return arithService.subtract(a, b);
  }

  @GetMapping("/multiply")
  public long multiply(@RequestParam long a, @RequestParam long b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public long divide(@RequestParam long a, @RequestParam long b) {
    return arithService.divide(a, b);
  }
}
