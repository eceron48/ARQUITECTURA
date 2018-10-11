package uan.edu.co;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService{

	@Override
	public String Greeting() {
		
		return "hola amigos";
	}

	
}
