package com.ssd.blog.web;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssd.blog.exceptions.ExceptionDetails;
import com.ssd.blog.exceptions.TitleExistedException;

@ControllerAdvice
public class ExceptionRestController {

	@ExceptionHandler(value = TitleExistedException.class)
	public ResponseEntity<ExceptionDetails> exception(TitleExistedException exception)
	{
		ExceptionDetails details = new ExceptionDetails(new Date(),exception.getExceptionMsg(),exception.getTitle());
		return new ResponseEntity<ExceptionDetails>(details,HttpStatus.NOT_FOUND);
	}
}
