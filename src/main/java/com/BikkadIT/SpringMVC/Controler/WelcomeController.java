package com.BikkadIT.SpringMVC.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("Wel come Class Controler");
	}
@GetMapping("/ welcomemsg")
public ModelAndView welcomemsg()
{
String msg="Wel come to Bikkad IT";

ModelAndView mv=new ModelAndView();
mv.addObject("MESSAGE",msg);
mv.setViewName("Welcome");

return mv;
}
}
