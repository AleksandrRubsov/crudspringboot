package com.ruba.crudspringboot.repository;

import com.ruba.crudspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
