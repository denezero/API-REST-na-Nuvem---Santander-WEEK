package me.dnis.service;

import me.dnis.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
