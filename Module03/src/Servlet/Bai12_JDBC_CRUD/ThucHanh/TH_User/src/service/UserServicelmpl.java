package service;

import model.User;
import repository.UserRepository;
import repository.UserRepositorylmpl;

import java.util.List;

public class UserServicelmpl  implements UserService{
    private UserRepository userRepository = new UserRepositorylmpl();
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public  List<User> finById(String name) {
        return userRepository.finById(name);
    }

    @Override
    public void update(int id, User user) {
        userRepository.update(id,user);
    }


    @Override
    public void remove(int id) {
        userRepository.remove(id);
    }

    @Override
    public User finById1(int id) {
        return userRepository.finById1(id);
    }
}
