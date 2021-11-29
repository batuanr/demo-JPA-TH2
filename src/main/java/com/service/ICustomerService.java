package com.service;

import com.model.Customer;

import java.util.List;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
    List<Customer> getAll();
}
