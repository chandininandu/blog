package com.ssd.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.blog.payload.PostDto;
import com.ssd.blog.serviceimpl.PostServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PostRestController {
	
	@Autowired
	public PostServiceImpl postServiceImpl;
	
	@PostMapping("/posts")
	public ResponseEntity<PostDto> sendPost(@Validated  @RequestBody PostDto postDto){
		
	return new ResponseEntity<PostDto> ( postServiceImpl.sendPost(postDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable("id") Long id){
		PostDto post=postServiceImpl.getPostById(id);
		return new ResponseEntity<PostDto>(post,HttpStatus.OK);
	}
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPosts(){
		List<PostDto> dto=postServiceImpl.getAllPosts();
		return new ResponseEntity<List<PostDto>>(dto,HttpStatus.OK);
	}
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id){
		String msg=postServiceImpl.postDelateById(id);
		return new ResponseEntity<String>("record is deleted",HttpStatus.OK);
	}
}
