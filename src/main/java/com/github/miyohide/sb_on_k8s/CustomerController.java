package com.github.miyohide.sb_on_k8s;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
  private CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping("/customers")
  public List<Customer> index() {
    return customerRepository.getAllCustomers();
  }
}
