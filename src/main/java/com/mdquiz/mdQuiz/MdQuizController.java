package com.mdquiz.mdQuiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MdQuizController {

	@RequestMapping("/")
	public String index() {
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