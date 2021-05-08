package com.poc.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ToDoApplication {
	
   @RequestMapping("/")
   @ResponseBody
   String home() {
      return "Hello World!";
   }
   
   @RequestMapping("/test")
   @ResponseBody
   String test() {
      return "Hello World Test 1!";
   }

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

}
