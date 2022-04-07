package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.sevices.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
