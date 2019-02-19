package com.piks.activemqjmsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piks.activemqjmsdemo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
