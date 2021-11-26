package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    List<User> finById(String name);
    void update(int id, User user);
    void remove(int id);
    User finById1(int id);
    User getUserById(int id);
    void insertUserstore(User user);
}
