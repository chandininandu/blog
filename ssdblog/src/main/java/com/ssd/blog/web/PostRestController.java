package com.ssd.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.blog.payload.PostDto;
import com.ssd.blog.serviceimpl.ErrorMsgvalidation;
import com.ssd.blog.serviceimpl.PostServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class PostRestController {

	@Autowired
	public PostServiceImpl postServiceImpl;

	@Autowired
	public ErrorMsgvalidation errorMsgvalidation;

	@PostMapping("/posts")
	public ResponseEntity<?> SavePost(@Valid @RequestBody PostDto postDto, BindingResult errorresult) {

		if (errorresult.hasErrors()) {
			return errorMsgvalidation.getBindingResultErrors(errorresult);
		} else {
			return new ResponseEntity<PostDto>(postServiceImpl.sendPost(postDto), HttpStatus.CREATED);
		}
	}

	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPost() {
		return new ResponseEntity<List<PostDto>>(postServiceImpl.getAllPosts(), HttpStatus.OK);
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Long id ){
		return new ResponseEntity<PostDto> ( postServiceImpl.getPostById(id),HttpStatus.OK);
		}

}
