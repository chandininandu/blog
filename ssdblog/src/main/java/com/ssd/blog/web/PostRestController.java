package com.ssd.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.blog.payload.PostDto;
import com.ssd.blog.serviceimpl.ErrorMessageGeneratrorValidation;
import com.ssd.blog.serviceimpl.PostServiceImpl;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostRestController {
	
	@Autowired
	public PostServiceImpl postServiceImpl;

	/*
	 * @PostMapping("/posts") public ResponseEntity<PostDto>
	 * sendPost(@Validated @RequestBody PostDto postDto){
	 * 
	 * return new ResponseEntity<PostDto> (
	 * postServiceImpl.sendPost(postDto),HttpStatus.CREATED); }
	 */
	@Autowired
	public ErrorMessageGeneratrorValidation errorMsgs;
	
	@PostMapping("/posts")
	public ResponseEntity<?> sendPost(@Valid @RequestBody PostDto postDto,BindingResult errorResults){
		if(errorResults.hasErrors()) {
			return errorMsgs.getBindingResultErrors(errorResults);
		}else {
			return new ResponseEntity<PostDto> ( postServiceImpl.sendPost(postDto),HttpStatus.CREATED);
		}
		
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPosts(){
		return new ResponseEntity<List<PostDto>> ( postServiceImpl.getAllPosts(),HttpStatus.OK);
		
	}
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Long id){
		return new ResponseEntity<PostDto> ( postServiceImpl.getPostById(id),HttpStatus.OK);
		}
	@DeleteMapping("/posts/{id}")
	public void deletePostById(@PathVariable Long id){
		postServiceImpl.deletePostById(id);
		}
	@PutMapping("/posts/{id}")
public ResponseEntity<PostDto> updatePost(@PathVariable Long id,@RequestBody PostDto postDto) {
		postDto.setId(id);
		PostDto dto=postServiceImpl.updatePost(postDto);
		return new ResponseEntity<PostDto>( dto,HttpStatus.OK);
	
}
}
