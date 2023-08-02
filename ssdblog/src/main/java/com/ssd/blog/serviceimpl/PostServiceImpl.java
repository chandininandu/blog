package com.ssd.blog.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.blog.entity.Post;
import com.ssd.blog.exceptions.TitleExistedException;
import com.ssd.blog.payload.PostDto;
import com.ssd.blog.repository.PostRepository;

@Service
public class PostServiceImpl {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
public PostDto sendPost(PostDto dto) {
		
		Post post = this.modelMapper.map(dto, Post.class);
		
		try
		{
		post = postRepository.save(post);
		}
		catch (Exception e) {
			e.getStackTrace();
			throw new TitleExistedException(dto.getTitle(), "already  "+dto.getTitle()+"  existed");
			}
		
		dto = this.modelMapper.map(post, PostDto.class);
		
		 return dto;
	}
	
	public List<PostDto> getAllPosts()
	{
		List<PostDto> dtoList= new ArrayList<>();
		
		List<Post> postList=postRepository.findAll();
		
		for(Post p:postList)
		{
			PostDto dto= this.modelMapper.map(p,PostDto.class);
			dtoList.add(dto);
		}
		return dtoList;
		
	}
	
	
public PostDto updatePost(PostDto postDto) {
		
		Long id=postDto.getId();
		//Post post=this.modelMapper.map(postDto,Post.class);
		
		Post post=	postRepository.findById(id).get();
		
		
		
		if(postDto.getContent()!=null)
		{
		post.setContent(postDto.getContent());
		}
		if(postDto.getPostDate()!=null)
		{
		post.setPostDate(postDto.getPostDate());
		}
		if(postDto.getDescription()!=null)
		{
		post.setDescription(postDto.getDescription());
		}
		if(postDto.getTitle()!=null)
		{
		post.setTitle(postDto.getTitle());
		}
		post=postRepository.save(post);
		PostDto dtoPost=this.modelMapper.map(post,PostDto.class);
		return dtoPost;
	}
	
	
	public PostDto getPostById(Long id) {
		
		Post post=postRepository.findById(id).get();
		PostDto dto =this.modelMapper.map(post,PostDto.class);
		return dto;
		
	}
	
	public void deletePostById(Long id) {
		postRepository.deleteById(id);
		
	}

	public void deleteAllPost() {

		postRepository.deleteAll();
	}
	
	
}
