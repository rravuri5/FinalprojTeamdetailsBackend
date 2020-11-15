package com.org.dxc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dxc.model.TeamDetails;

public interface TeamDetailsRepository extends JpaRepository<TeamDetails, Integer> {

	
	public List<TeamDetails> findAll();
}
