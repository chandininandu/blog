package com.ssd.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.blog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
