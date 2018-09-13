package com.rjpard.mergeapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rjpard.mergeapp.domain.Message;
import com.rjpard.mergeapp.domain.Team;

@RestController
public class MergeController {

	@GetMapping("/message")
	public Message helloWorld(@RequestParam(value = "message", defaultValue = "HelloWorld") String message) {
		Message messageObj = new Message(message);
		return messageObj;
	}

	@GetMapping("/team")
	public List<Team> teams() {
		Team team = new Team("Real Madrid");
		Team team2 = new Team("Barcelona");
		List<Team> teams = new ArrayList<Team>();
		teams.add(team);
		teams.add(team2);
		return teams;
	}

	@GetMapping("/hotfix")
	public Message helloWorld() {
		Message messageObj = new Message("hotfix");
		return messageObj;
	}
}
