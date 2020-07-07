package com.toy.mysite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysiteController {

	@GetMapping("/axiosTest")
	public String axiosTest() {
		return "Axios Test Success!!";
	}
	
	
	
	/*@GetMapping("/board/main")
	public Board main() {
		
		return Board;
	}*/
}
