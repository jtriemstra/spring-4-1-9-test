package com.jtriemstra.test.spring.spring_4_1_9_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	JsonPlaceholderClient apiClient;
	
	public String sampleMethod() {
		return "This is a service method";
	}
	
	public JsonPlaceholderDto fromApi() {
		return apiClient.getSampleObject();
	}
	
	public String fromApiString() {
		return apiClient.getSampleString();
	}
}
