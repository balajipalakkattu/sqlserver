package com.bal.sqlserverdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bal.sqlserverdata.model.Customer;
import com.bal.sqlserverdata.repository.CustomerRepo;

@RestController
@RequestMapping("/demo")
public class CustomerController {

@Autowired
private CustomerRepo customerRepository;

@GetMapping(path="/all")
public @ResponseBody Iterable<Customer> getAllUsers() {
  // This returns a JSON or XML with the users
	System.out.println("Get All");
  return customerRepository.findAll();
}

}
