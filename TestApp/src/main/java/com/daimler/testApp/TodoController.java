package com.daimler.testApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

	 
	 @RequestMapping("/create")
	 public String create(ToDo todo) {
//	  todo = todoRepository.save(todo);
	  return "Todo created successfully";
	 }
	 
	@RequestMapping("/all")
	 public String readAll() {
	  return "Todo created1aaaa successfully";
	}
}
