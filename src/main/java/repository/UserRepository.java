package repository;
import model.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import  java.util.UUID;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    boolean checkPassword(String email,String password);

    List<User> findAll();

    void delete(UUID id);
}

