package com.ssd.log.projectlog.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.log.projectlog.entity.Post;
import com.ssd.log.projectlog.postDto.PostDto;
import com.ssd.log.projectlog.repository.PostRepository;
@Service
public class PostServiceImpl {
	

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public PostDto sendPost(PostDto dto) {
		
		Post post = this.modelMapper.map(dto, Post.class);
		
		post = postRepository.save(post);
		
		dto = this.modelMapper.map(post, PostDto.class);
		
		 return dto;
	}

}
