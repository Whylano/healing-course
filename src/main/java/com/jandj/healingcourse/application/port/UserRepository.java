package com.jandj.healingcourse.application.port;

import com.jandj.healingcourse.domain.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
    User save(User user);
}
