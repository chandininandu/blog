package com.ssd.log.projectlog.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.log.projectlog.postDto.CommentDto;
import com.ssd.log.projectlog.serviceImpl.CommentService;

@RestController
@RequestMapping("/api")
public class Commentcontroller {
	
	
	@Autowired
	public CommentService  commentService;
	
	@PostMapping("/posts/{postid}/comments")
	public ResponseEntity<CommentDto> createComment(@PathVariable(value = "postid") Integer id,
	                                             @RequestBody CommentDto CommentDto ) {
		
	CommentDto commentDto =	commentService.createComment(id, CommentDto);
		return new ResponseEntity<CommentDto>(commentDto,HttpStatus.CREATED);
		
	}
		
	@GetMapping("/posts/{postid}/comments/{Id}")
	public ResponseEntity<CommentDto> getCommentsbyId(@PathVariable(value = "postid")Integer id,
		                                         @PathVariable(value = "Id")Long cId) {
    CommentDto commentDto = commentService.getCommentsById(id, cId);
	    
	return new ResponseEntity<CommentDto>(commentDto,HttpStatus.OK);
	
}
	@GetMapping("/posts/{postid}/comments")
	public ResponseEntity<List<CommentDto>> getAllComments(@PathVariable(value = "postid")Integer id){
		
		List<CommentDto> commentDtoList=commentService.getAllcomments(id);
		return new ResponseEntity<List<CommentDto>>(commentDtoList,HttpStatus.OK);
		
		
	}
	

}

