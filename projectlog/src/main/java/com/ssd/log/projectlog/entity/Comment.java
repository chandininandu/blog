package com.ssd.log.projectlog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long cId;

	    private String name;
	    private String email;
	    private String body;
		

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "post_id", nullable = false)
	    private Post post;

		public long getId() {
			return cId;
		}

		public void setId(long id) {
			this.cId = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public Post getPost() {
			return post;
		}

		public void setPost(Post post) {
			this.post = post;
		}

		public Comment(long id, String name, String email, String body, Post post) {
			super();
			this.cId = id;
			this.name = name;
			this.email = email;
			this.body = body;
			this.post = post;
		}

		public Comment() {
			super();
		}

		public Comment(String name, String email, String body, Post post) {
			super();
			this.name = name;
			this.email = email;
			this.body = body;
			this.post = post;
		}
	    
	    
	    
	    
}