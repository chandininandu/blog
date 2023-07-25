package com.ssd.blog.web;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.ssd.blog.exceptions.ExceptionDetails;
import com.ssd.blog.exceptions.TitleExistetExcetion;

@ControllerAdvice
public class SsdBlogExceptionRestController {
	ResponseEntity<ExceptionDetails> exception(TitleExistetExcetion exception){
		ExceptionDetails ed=new ExceptionDetails(new Date(),exception.getTitle(),exception.getExpMsg());
		return new ResponseEntity<ExceptionDetails>(ed,HttpStatus.NOT_FOUND);
	}

}
