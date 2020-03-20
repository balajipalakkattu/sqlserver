package com.bal.sqlserverdata.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bal.sqlserverdata.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Optional<Customer> findById(Integer id);
}
