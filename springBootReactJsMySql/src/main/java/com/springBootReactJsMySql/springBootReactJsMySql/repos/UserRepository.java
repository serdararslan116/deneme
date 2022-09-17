package com.springBootReactJsMySql.springBootReactJsMySql.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootReactJsMySql.springBootReactJsMySql.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
