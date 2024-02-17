package com.github.miyohide.sb_on_k8s;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Customer {
  private Long id;
  private String firstName;
  private String lastName;
}
