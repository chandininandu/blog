package com.ssd.log.projectlog.serviceImpl;




import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ssd.log.projectlog.entity.Post;
import com.ssd.log.projectlog.exception.TitleExceptionMsg;
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
		try {
		post = postRepository.save(post);
		}catch (Exception e) {
			e.getMessage();
			throw new TitleExceptionMsg(dto.getTitle(), "Already "+dto.getTitle()+ "  existed");
		}
		dto = this.modelMapper.map(post, PostDto.class);
		
		 return dto;
		 
	}


	public List<Post> getAllPosts() {
	List<Post> postList =	postRepository.findAll();
		return postList;
	}
	
  }

