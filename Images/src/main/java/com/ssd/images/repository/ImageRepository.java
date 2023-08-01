package com.ssd.images.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssd.images.model.Image;

public interface ImageRepository extends MongoRepository<Image, String> {

	
	
	
}
