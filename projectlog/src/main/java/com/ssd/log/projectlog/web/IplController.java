package com.ssd.log.projectlog.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.log.projectlog.entity.IplMatches;
import com.ssd.log.projectlog.serviceImpl.IplServiceImpl;

@RestController
@RequestMapping("/api")
public class IplController {
	@Autowired
	public IplServiceImpl  iplServiceImpl;
	
	@GetMapping("/ipl")
	public ResponseEntity <List<IplMatches>> getAllMatches(
			
			@RequestParam(value = "pnumer",defaultValue = "1",required = false)int pnumer,
			@RequestParam(value = "psize",defaultValue = "10",required = false)int psize,
			@RequestParam(value = "sortBy",defaultValue = "id",required = false)String sortBy,
			@RequestParam(value = "sortDirec",defaultValue = "ASC",required = false)String sortDirec
			
			){
		
		List<IplMatches> matchesList= iplServiceImpl.getAllMatches( pnumer, psize, sortBy, sortDirec);
		
		return new ResponseEntity <List<IplMatches>>(matchesList,HttpStatus.OK);
		 
		
	}

}
