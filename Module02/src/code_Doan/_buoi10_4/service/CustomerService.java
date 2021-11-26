package code_Doan._buoi10_4.service;

import code_Doan._buoi10_4.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer  customer);
    Customer findById(int id);
    void updata( int id, Customer customer);
    void remove( int id);
}
