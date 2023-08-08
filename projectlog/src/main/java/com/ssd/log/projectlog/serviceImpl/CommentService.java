package com.ssd.log.projectlog.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.log.projectlog.entity.Comment;
import com.ssd.log.projectlog.entity.Post;
import com.ssd.log.projectlog.postDto.CommentDto;
import com.ssd.log.projectlog.repository.CommentRepository;
import com.ssd.log.projectlog.repository.PostRepository;
@Service
public class CommentService {
	
	@Autowired
	public ModelMapper modelMapper;
	
	@Autowired
	public CommentRepository commentRepository;
	@Autowired
	public PostRepository postRepository;
	
	public CommentDto  createComment(Integer id, CommentDto commentDto) {
		
		 Post post = postRepository.findById(id).orElseThrow();
	               
	Comment comment=this.modelMapper.map(commentDto, Comment.class);
	comment.setPost(post);
       comment =	commentRepository.save(comment);
       
       commentDto=this.modelMapper.map(comment, CommentDto.class);
	
	return commentDto;
		
	}
	public CommentDto getCommentsById(Integer id,Long cId){
		
		//Post post = postRepository.findById(id).orElseThrow();
		
		Comment  comment = commentRepository.findById(cId).orElseThrow();
		 
		 
	CommentDto	  Dto =  this.modelMapper.map(comment, CommentDto.class);
	
		return Dto;
	
	}
	public List<CommentDto> getAllcomments(Integer id){
		List<CommentDto> commentdtoList = new ArrayList<>();
		Post post = postRepository.findById(id).orElseThrow();
		
		List<Comment> commentlist=commentRepository.findAll();
		
		for(Comment comm :commentlist) {
			CommentDto dto = new CommentDto();
			dto= this.modelMapper.map(comm, CommentDto.class);
			commentdtoList.add(dto);
		}
		return commentdtoList;
				
	}
	

}
