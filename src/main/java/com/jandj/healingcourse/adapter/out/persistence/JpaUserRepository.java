package com.jandj.healingcourse.adapter.out.persistence;

import com.jandj.healingcourse.application.port.UserRepository;
import com.jandj.healingcourse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUserRepository extends UserRepository, JpaRepository<User, Long> {
    @Override
    Optional<User> findByUsername(String username);

    @Override
    User save(User user);
}
