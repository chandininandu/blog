package com.ssd.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

	

	
}
