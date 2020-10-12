package com.fms.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
