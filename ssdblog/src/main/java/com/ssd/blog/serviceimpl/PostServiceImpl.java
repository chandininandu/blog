package com.ssd.blog.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.ssd.blog.entity.Post;
import com.ssd.blog.exceptions.TitleExistetExcetion;
import com.ssd.blog.payload.PostDto;
import com.ssd.blog.repository.PostRepository;



@Service
public class PostServiceImpl {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	/*
	 * public PostDto sendPost(PostDto dto) {
	 * 
	 * Post post = this.modelMapper.map(dto, Post.class); post =
	 * postRepository.save(post); dto = this.modelMapper.map(post, PostDto.class);
	 * 
	 * return dto; }
	 */
	
public PostDto sendPost(PostDto dto) {
		
		Post post = this.modelMapper.map(dto, Post.class);
		try {
		post = postRepository.save(post);
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			throw new TitleExistetExcetion(dto.getTitle(),"Allready  "+dto.getTitle()+"   Existed");
		}
		dto = this.modelMapper.map(post, PostDto.class);
		
		return dto;
	}

public List<PostDto> getAllPosts(){
	List<PostDto> dtoList = new ArrayList();
	List<Post> postList =   postRepository.findAll();
	
	for(Post post:postList) {
		PostDto dto = new PostDto();
		dto = this.modelMapper.map(post, PostDto.class);
		dtoList.add(dto);
	}
	
	 return dtoList;
}
public PostDto getPostById(Long id){
	Post post =   postRepository.findById(id).get();
	PostDto	dto = this.modelMapper.map(post, PostDto.class);
	 return dto;
}
public void deletePostById(Long id){
   postRepository.deleteById(id);
}


public PostDto updatePost(PostDto dto) {
	Post post = this.modelMapper.map(dto, Post.class);
       post = postRepository.save(post);
       PostDto	dtoo = this.modelMapper.map(post, PostDto.class);
	return dtoo;
	}
	
}
