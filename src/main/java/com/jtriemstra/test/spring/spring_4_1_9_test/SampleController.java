package com.jtriemstra.test.spring.spring_4_1_9_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	@RequestMapping("/sample")
	public String sampleAction() {
		return "This is a controller action";
	}
	
	
}
