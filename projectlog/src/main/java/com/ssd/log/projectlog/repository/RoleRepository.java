package com.ssd.log.projectlog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.log.projectlog.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	 Optional<Role> findByName(String name);

}