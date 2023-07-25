package com.ssd.log.projectlog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.log.projectlog.postDto.PostDto;
import com.ssd.log.projectlog.serviceImpl.ErrorMsgvalidation;
import com.ssd.log.projectlog.serviceImpl.PostServiceImpl;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class PostController {
	
	
	@Autowired
	public PostServiceImpl postServiceImpl;
	 
	@Autowired
	public ErrorMsgvalidation errorMsgvalidation;
	
	@PostMapping("/posts")
	public ResponseEntity<?> SavePost(@Valid @RequestBody PostDto postDto,BindingResult errorresult){

		if(errorresult.hasErrors()) {
			return errorMsgvalidation.getBindingResultErrors(errorresult);
		}else {
			
		
		
		return new ResponseEntity<PostDto> ( postServiceImpl.sendPost(postDto),HttpStatus.CREATED);
		}
	}
	
	
	
}
