package com.projeto.santander_dev_week.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.santander_dev_week.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}