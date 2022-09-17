package com.springBootReactJsMySql.springBootReactJsMySql.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootReactJsMySql.springBootReactJsMySql.entities.Like;

public interface LikeRepository extends JpaRepository<Like,Long> {

}
