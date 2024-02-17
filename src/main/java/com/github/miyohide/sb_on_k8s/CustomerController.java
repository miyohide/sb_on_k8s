package com.github.miyohide.sb_on_k8s;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CustomerController {
  private CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping("/customers")
  public List<Customer> index() {
    log.info("/customersにGETアクセスがありました");
    return customerRepository.getAllCustomers();
  }
}
