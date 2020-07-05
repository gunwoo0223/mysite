package com.toy.mysite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysiteController {

	@GetMapping("/test")
	public String Test() {
		return "Success!!";
	}
}
