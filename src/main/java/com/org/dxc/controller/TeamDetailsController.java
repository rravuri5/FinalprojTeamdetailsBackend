package com.org.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.model.TeamDetails;
import com.org.dxc.service.TeamDetailsService;

@RestController
@RequestMapping(value="/web")
@CrossOrigin(origins="http://localhost:4200")
public class TeamDetailsController {
    @Autowired
	TeamDetailsService service;
	
    @GetMapping("/hi")
    public String sayHello() {
    	return "hello world";
    }
    @RequestMapping("/teamdetails")
    public List <TeamDetails> getTeamDetails() {
    	return service.getAllTeamDetails();
    }
}
