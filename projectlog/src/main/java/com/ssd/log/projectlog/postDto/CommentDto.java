package com.ssd.log.projectlog.postDto;

public class CommentDto {

	
	 private long cId;

	    private String name;
	    private String email;
	    private String body;
		public long getId() {
			return cId;
		}
		public void setId(long pid) {
			this.cId = pid;
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
		public CommentDto(String name, String email, String body) {
			super();
			this.name = name;
			this.email = email;
			this.body = body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public CommentDto(long pid, String name, String email, String body) {
			super();
			this.cId = pid;
			this.name = name;
			this.email = email;
			this.body = body;
		}
		public CommentDto() {
			super();
		}
		
	    
	    
}
