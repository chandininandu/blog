package com.ssd.log.projectlog.web;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssd.log.projectlog.exception.ExceptionDetails;
import com.ssd.log.projectlog.exception.TitleExceptionMsg;

@ControllerAdvice

public class BlogExceptionRestController {
	
	@ExceptionHandler(value = TitleExceptionMsg.class)

	public ResponseEntity<ExceptionDetails> exception(TitleExceptionMsg exception){
		
		ExceptionDetails ed = new ExceptionDetails(new Date(),exception.getTitle(),exception.getExpMsg());
		
		return  new ResponseEntity<ExceptionDetails> (ed,HttpStatus.NOT_FOUND);
	}
}
