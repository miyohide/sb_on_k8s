package com.github.miyohide.sb_on_k8s;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class WelcomeController {
  @GetMapping("/")
  public Map<String, String> index() {
    log.info("Welcome#indexにアクセスがありました");
    return Map.of(
            "message", "こんにちは",
            "page", "WelcomeController#index"
            );
  }
}
