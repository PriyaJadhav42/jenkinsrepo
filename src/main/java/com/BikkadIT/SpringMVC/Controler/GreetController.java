package com.BikkadIT.SpringMVC.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greetmsg(Model model)
	{
		String getmsg="Good Evening All of you";
		
	model.addAttribute("GREETMESSAGE",getmsg);
		
		return "greet";
		
	
	}
	
}
