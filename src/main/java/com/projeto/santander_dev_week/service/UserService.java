package com.projeto.santander_dev_week.service;
import com.projeto.santander_dev_week.model.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
