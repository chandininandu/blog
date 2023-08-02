package com.ssd.blog.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ssd.blog.entity.IplMatches;
import com.ssd.blog.repository.IplMatchesRepository;



@Service
public class MatchesServicecImpl {

	@Autowired
	public IplMatchesRepository iplMatchesRepository;
	
	
	public List<IplMatches> getAllMatchesDetails(Integer pageNo,Integer size,String sortDir,String sortBy)
	{
		Sort sort =  sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
		Pageable pageble= PageRequest.of(pageNo,size,sort);
		Page<IplMatches> page=iplMatchesRepository.findAll(pageble);
		List<IplMatches> matchsList=page.getContent();
		return matchsList;
	}
	
}
