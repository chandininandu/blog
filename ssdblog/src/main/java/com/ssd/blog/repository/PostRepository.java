package com.ssd.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.blog.entity.Post;
import com.ssd.blog.payload.PostDto;

public interface PostRepository extends JpaRepository<Post, Long>{

	
	
}
