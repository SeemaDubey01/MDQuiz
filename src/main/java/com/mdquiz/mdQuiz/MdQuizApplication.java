package com.mdquiz.mdQuiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MdQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdQuizApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
	System.out.println("inside index");
	return "index";
	}
	@RequestMapping("/page2")
	public String page2() {
	return "page2";
	}
	@RequestMapping("/StartQuiz")
	public String startpage() {
	return "startquiz";
	}
	@RequestMapping("/dbpage")
	public String dbpage() {
	return "dbpage";
	}
	
}