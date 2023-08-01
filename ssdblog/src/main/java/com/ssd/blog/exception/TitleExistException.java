package com.ssd.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED)
public class TitleExistException extends RuntimeException{
	public String title;
	public String exceptionMsg;
	public String getTitle() {
		return title;
	}
	public TitleExistException(String title) {
		super();
		this.title = title;
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
	public TitleExistException(String title, String exceptionMsg) {
		super();
		this.title = title;
		this.exceptionMsg = exceptionMsg;
	}
	
}
