package com.example.cashbookexample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorldController {

	@GetMapping("/hello")
    public String helloWorld() {
        return "Hello World. Welcome to the cashbook";
    }
	
	
}
