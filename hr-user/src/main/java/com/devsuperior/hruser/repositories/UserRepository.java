package com.devsuperior.hruser.repositories;


import com.devsuperior.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
