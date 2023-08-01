package com.ssd.Blog.web;


import java.util.List;

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

import com.ssd.Blog.payload.PostDto;
import com.ssd.Blog.service.ErrorMsgService;
import com.ssd.Blog.service.postService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/main")
public class PostController {
	
	@Autowired
	public postService postService;
	
	@Autowired
	public ErrorMsgService errorMsgService;
	
	@PostMapping("/Posts")
	public ResponseEntity<?> makePost(@Valid @RequestBody PostDto postDto,BindingResult errorresult){

		if(errorresult.hasErrors()) {
			return errorMsgService.getBindingErrors(errorresult);
		}else {
			return new ResponseEntity<PostDto> ( postService.makePost(postDto),HttpStatus.CREATED);
		}

	}
	@GetMapping("/Posts")
	public  ResponseEntity<List<PostDto>> getAllPosts(){
		return new ResponseEntity<List<PostDto>>(postService.getAllPosts(),HttpStatus.OK);
		
	}
	
	@GetMapping("/Posts/{id}")
	public ResponseEntity<PostDto> getDetailsById(@PathVariable Integer id) {
	PostDto post =	postService.getById(id);
		return new ResponseEntity<PostDto>(post, HttpStatus.OK);

	}
	@DeleteMapping("/Posts/{id}")
	public void deleteDetailsById(@PathVariable Integer id) {
		postService.deleteDetailsById(id);

	}

	@PutMapping("/Posts/{id}")
	public ResponseEntity<PostDto> updateDetailsById(@PathVariable Integer id, @RequestBody PostDto dto) {
		PostDto updatedPost = postService.updateDetailsById(id, dto);

		if (updatedPost == null) {

			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(updatedPost);
	}



}
