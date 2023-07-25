package com.ssd.log.projectlog.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;


@Service
public class ErrorMsgvalidation {
	
	public ResponseEntity<Map<String, String> > getBindingResultErrors(BindingResult errorResults){
		
		Map<String,String> errorMap = new HashMap<>();
		
		for(FieldError fielderror:errorResults.getFieldErrors()) {
			
			errorMap.put(fielderror.getField(), fielderror.getDefaultMessage());
			
		}
		return new ResponseEntity<Map<String,String>>(errorMap,HttpStatus.BAD_REQUEST);
		
		
		
		
	}

}
