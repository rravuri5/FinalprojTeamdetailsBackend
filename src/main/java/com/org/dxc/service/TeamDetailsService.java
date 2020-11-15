package com.org.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.model.TeamDetails;
import com.org.dxc.repository.TeamDetailsRepository;

@Service
public class TeamDetailsService {

	@Autowired
	TeamDetailsRepository dao;
	
	public List<TeamDetails> getAllTeamDetails() {
		return dao.findAll();
	}
}
