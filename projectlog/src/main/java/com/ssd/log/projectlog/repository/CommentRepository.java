package com.ssd.log.projectlog.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.log.projectlog.entity.Comment;
import com.ssd.log.projectlog.postDto.CommentDto;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);

	

	

}
