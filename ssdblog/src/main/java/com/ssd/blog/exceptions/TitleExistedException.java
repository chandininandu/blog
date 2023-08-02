package com.ssd.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.ALREADY_REPORTED)
public class TitleExistedException extends RuntimeException{

	public String title;
	public String exceptionMsg;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public TitleExistedException() {
		super();
	}
	public TitleExistedException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}
	public TitleExistedException(String title, String exceptionMsg) {
		super();
		this.title = title;
		this.exceptionMsg = exceptionMsg;
	}
	
	
	
}
