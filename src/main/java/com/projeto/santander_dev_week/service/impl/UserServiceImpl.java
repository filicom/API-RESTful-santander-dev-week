package com.projeto.santander_dev_week.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.projeto.santander_dev_week.model.User;
import com.projeto.santander_dev_week.repository.UserRepository;
import com.projeto.santander_dev_week.service.UserService;

@Service
public class UserServiceImpl implements UserService{


private final UserRepository userRepository;

public UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
}

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

   

}
