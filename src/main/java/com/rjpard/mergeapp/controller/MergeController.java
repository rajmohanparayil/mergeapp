package com.rjpard.mergeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rjpard.mergeapp.domain.Message;

@RestController
public class MergeController {

	@GetMapping("/message")
	public Message helloWorld(@RequestParam(value = "message", defaultValue = "HelloWorld") String message) {
		Message messageObj = new Message(message);
		return messageObj;
	}

	@GetMapping("/message/release1")
	public Message release_one_helloWorld(@RequestParam(value = "message", defaultValue = "release1") String message) {
		Message messageObj = new Message("release1 - "+message);
		return messageObj;
	}

	public Message release_one_inprogress_helloWorld(@RequestParam(value = "message", defaultValue = "release1-inprogress") String message) {
		Message messageObj = new Message("release1-inprogress - "+message);
		return messageObj;
	}
}
