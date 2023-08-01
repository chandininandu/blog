package com.ssd.Blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
	public List<PostDto> getAllPosts(){
		List<PostDto> PostDtoList= new ArrayList<>();
		List<PostEntity> postList = postRepository.findAll();
		for(PostEntity post :postList) {
			PostDto dto = new PostDto();
			dto= this.modelMapper.map(post,PostDto.class);
			PostDtoList.add(dto);
		}
		return PostDtoList;
	}
	
	public PostDto getById(Integer id) {
		PostEntity post = postRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Employee Id is Not Existed"));
		return this.modelMapper.map(post, PostDto.class);

	}

	public void deleteDetailsById(Integer id) {

		postRepository.deleteById(id);

	}
	public PostDto updateDetailsById(Integer id, PostDto updatedPostDto) {

		Optional<PostEntity> optionalPost = postRepository.findById(id);
		if (!optionalPost.isPresent()) {
			return null;
		}
		PostEntity existingPost = optionalPost.get();

		existingPost.setTittle(updatedPostDto.getTittle());
		existingPost.setContent(updatedPostDto.getContent());
		PostEntity updatedPost = postRepository.save(existingPost);

		return modelMapper.map(updatedPost, PostDto.class);
	}




}
