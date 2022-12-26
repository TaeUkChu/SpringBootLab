package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody
	@GetMapping("/sbb")
	public String index() {
		//System.out.println("index");
		return "index";
	}
}
