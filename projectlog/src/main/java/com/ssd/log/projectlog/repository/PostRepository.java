package com.ssd.log.projectlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.log.projectlog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
