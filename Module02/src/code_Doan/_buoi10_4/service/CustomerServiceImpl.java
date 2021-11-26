package code_Doan._buoi10_4.service;

import code_Doan._buoi10_4.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "nhu", "quynhnhuctcn@gmail.com", "Thanhhoa"));
        customers.put(2, new Customer(2, "nhu2", "quynhnhu2ctcn@gmail.com", "Thanhhoa1"));
        customers.put(3, new Customer(3, "nhu3", "quynhnhuc3tcn@gmail.com", "Thanhhoa3"));
        customers.put(4, new Customer(4, "nhu4", "quynhnhu4ctcn@gmail.com", "Thanhhoa4"));
        customers.put(5, new Customer(5, "nhu5", "quynhnhu5ctcn@gmail.com", "Thanhhoa5"));
    };

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customer.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void updata(int id, Customer customer) {
        customer.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}

