package com.repository;

import com.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
    List<Customer> getAll();
}
