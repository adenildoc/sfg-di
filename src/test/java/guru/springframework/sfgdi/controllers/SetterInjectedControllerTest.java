package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.sevices.ConstructorGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());;
	}

}
