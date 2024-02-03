package com.github.miyohide.sb_on_k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WelcomeController {
  @GetMapping("/")
  public Map<String, String> index() {
    return Map.of(
            "message", "こんにちは",
            "page", "WelcomeController#index"
            );
  }
}
