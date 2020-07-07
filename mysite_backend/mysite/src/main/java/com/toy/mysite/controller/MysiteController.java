package com.toy.mysite.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysiteController {

	private static final Log log = LogFactory.getLog(MysiteController.class);
	
	@GetMapping("/axiosTest")
	public String axiosTest() {
		log.info("axiosTest Method Entered!");
		return "Axios Test Success!!";
	}
	
	
	
	/*@GetMapping("/board/main")
	public Board main() {
		
		return Board;
	}*/
}
