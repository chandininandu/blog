package com.ssd.log.projectlog.postDto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;

public class PostDto {
	

	private Integer id;
	@NotEmpty(message = "please provide title")
	private String title;
	@NotEmpty(message = "please provide description")
	private String description;
	@NotEmpty(message = "please provide content")
	private String content;
	private Date postDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public PostDto(Integer id, String title, String description, String content, Date postDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}
	public PostDto(String title, String description, String content, Date postDate) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
		this.postDate = postDate;
	}
	public PostDto() {
		super();
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content
				+ ", postDate=" + postDate + "]";
	}

	
	

}
