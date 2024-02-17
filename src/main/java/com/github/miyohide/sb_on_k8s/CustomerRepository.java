package com.github.miyohide.sb_on_k8s;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
  private final JdbcTemplate jdbcTemplate;

  public CustomerRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Customer> getAllCustomers() {
    return new ArrayList<>(jdbcTemplate.query(
            "SELECT id, first_name, last_name FROM customers",
            (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
    ));
  }
}
