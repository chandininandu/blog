package com.ssd.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.blog.entity.IplMatches;
import com.ssd.blog.serviceimpl.MatchesServicecImpl;

@RestController
@RequestMapping("/api/v1")
public class MatchesRestController {
	
	@Autowired
	public MatchesServicecImpl matchesServicecImpl;
	
	@GetMapping("/matches")
	public ResponseEntity<List<IplMatches>> getAllMatches(@RequestParam(value = "pageNo",defaultValue ="0",required = false)Integer pageNo,
			@RequestParam(value = "size",defaultValue ="10",required = false)Integer size,
			@RequestParam(value = "sortDir",defaultValue ="ASC",required = false)String sortDir,
			@RequestParam(value = "sortBy",defaultValue ="id",required = false)String sortBy)	
	{
		List<IplMatches> matchesList=matchesServicecImpl.getAllMatchesDetails(pageNo,size,sortDir,sortBy);
		return new ResponseEntity<List<IplMatches>>(matchesList,HttpStatus.OK);		
	}

}
