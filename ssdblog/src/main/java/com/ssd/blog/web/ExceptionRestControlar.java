package com.ssd.blog.web;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssd.blog.exception.ExceptionDetails;
import com.ssd.blog.exception.TitleExistException;

@ControllerAdvice
public class ExceptionRestControlar {
	@ExceptionHandler(value = TitleExistException.class)
	public ResponseEntity<ExceptionDetails> exception(TitleExistException exception){
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(),exception.getTitle() ,exception.getExceptionMsg() );
		return new ResponseEntity<ExceptionDetails>(exceptionDetails,HttpStatus.NOT_FOUND);
	}
}
