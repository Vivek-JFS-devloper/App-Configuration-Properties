package in.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ramesh.constant.AppConstants;
import in.ramesh.properties.AppProperties;

@RestController
public class MyController {
	
	@Autowired
	private AppProperties properties;
	
	@GetMapping("/greet")
	public String greetMessage() {
		
		return properties.getMessage().get(AppConstants.GREET_MSG_KEY);
	}
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return properties.getMessage().get(AppConstants.WELCOME_MSG_KEY);
	}
}
