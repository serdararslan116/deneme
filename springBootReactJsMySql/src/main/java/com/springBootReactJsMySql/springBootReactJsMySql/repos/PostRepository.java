package com.springBootReactJsMySql.springBootReactJsMySql.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootReactJsMySql.springBootReactJsMySql.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

}
