package com.ssd.log.projectlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssd.log.projectlog.entity.IplMatches;

@Repository
public interface IplRepository  extends JpaRepository<IplMatches, Integer>{

}
