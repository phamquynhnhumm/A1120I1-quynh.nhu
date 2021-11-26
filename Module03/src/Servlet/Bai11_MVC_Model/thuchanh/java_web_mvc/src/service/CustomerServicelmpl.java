package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService {

    private  static Map<Integer, Customer> customers;
    static
    {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"nhu","quynhnhu@gmail.com","thanhhoa"));
        customers.put(2, new Customer(2,"lieu","liuey123@gmail.com","hanoi"));
        customers.put(3, new Customer(3,"huy","truognhuy@gmail.com","quangnam"));
    }
    @Override
    public List<Customer> findAll() {

        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer finById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {

        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
