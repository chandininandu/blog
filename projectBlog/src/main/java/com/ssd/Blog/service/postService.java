package com.ssd.Blog.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.Blog.Entity.PostEntity;
import com.ssd.Blog.payload.PostDto;
import com.ssd.Blog.repository.PostRepository;

@Service
public class postService {
	
	@Autowired
	public PostRepository postRepository;
	
	@Autowired
	public ModelMapper modelMapper;
	
	public PostDto makePost(PostDto Dto) {
		
		PostEntity post = this.modelMapper.map(Dto, PostEntity.class);
	   post  =	postRepository.save(post);
		
		Dto = this.modelMapper.map(post, PostDto.class);
		return Dto;
	}

}
