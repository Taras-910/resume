package ua.top.bootjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.top.bootjava.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
