
package com.ssd.log.projectlog.serviceImpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ssd.log.projectlog.entity.IplMatches;
import com.ssd.log.projectlog.repository.IplRepository;



@Service
public class IplServiceImpl {
	
	@Autowired
	public IplRepository iplRepository;
	
	public List<IplMatches> getAllMatches(int pnumer,int psize,String sortBy,String sortDirec){
		
		Sort sort = sortDirec.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
		
				Pageable pageable = PageRequest.of(pnumer, psize,sort);
				
				Page<IplMatches> pageList = iplRepository.findAll(pageable);
		
				
				return pageList.getContent();

	
	}
	
}
