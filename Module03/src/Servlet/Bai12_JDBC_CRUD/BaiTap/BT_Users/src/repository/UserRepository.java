package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    void save(User user);
    List<User> finById(String name);
    User update(int id, User user);
    void remove(int id);
    User finById1(int id);
    List<User> finByCountry(String country);
    List<User> Sort();
 }
