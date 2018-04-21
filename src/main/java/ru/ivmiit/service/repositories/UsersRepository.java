package ru.ivmiit.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivmiit.service.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByEmail(String name);
}
