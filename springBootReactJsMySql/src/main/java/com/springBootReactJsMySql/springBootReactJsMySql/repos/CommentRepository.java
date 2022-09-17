package com.springBootReactJsMySql.springBootReactJsMySql.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootReactJsMySql.springBootReactJsMySql.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
