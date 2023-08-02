package com.ssd.blog.payload;

import java.util.Date;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class PostDto {
	
	private Long id;
	
	@Nonnull
	private String title;
	@Nonnull
	private String description;
	private String content;
	private Date postDate;
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content
				+ ", postDate=" + postDate + "]";
	}




	public PostDto() {
		super();
	}




	public PostDto(Long id, String title, String description, String content, Date postDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public Date getPostDate() {
		return postDate;
	}




	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}




	public PostDto(String title, String description, String content, Date postDate) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}
	
	
	
	
}
