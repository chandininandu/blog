package com.ssd.log.projectlog.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.log.projectlog.entity.User;
import com.ssd.log.projectlog.postDto.UserDto;
import com.ssd.log.projectlog.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public ModelMapper modelMapper;
	public UserDto createUser(UserDto dto) {
		
		User user = this.modelMapper.map(dto, User.class);
	user=	userRepository.save(user);
	dto = this.modelMapper.map(user, UserDto.class);
	return dto;
		
 
		
	}
	
	

}
