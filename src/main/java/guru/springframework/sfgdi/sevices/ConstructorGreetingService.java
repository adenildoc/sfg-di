package guru.springframework.sfgdi.sevices;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
