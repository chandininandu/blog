package com.ssd.Blog.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssd.Blog.Entity.PostEntity;

public interface PostRepository extends MongoRepository<PostEntity, Integer> {

}
