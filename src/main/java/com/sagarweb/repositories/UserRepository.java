package com.sagarweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagarweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
