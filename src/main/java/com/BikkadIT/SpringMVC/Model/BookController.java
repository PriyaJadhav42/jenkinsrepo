package com.BikkadIT.SpringMVC.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


public class BookController {

	public BookController() {
		super();
		
	}
	@GetMapping("/books")
	public ModelAndView GetBookData()
	{
		Book book=new Book();
		book.setBid(111);
		book.setBName("Java");
		book.setBPrice(166.00);
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOK", book);
		mav.setViewName("books");
		return mav;
		
		
	}

}
