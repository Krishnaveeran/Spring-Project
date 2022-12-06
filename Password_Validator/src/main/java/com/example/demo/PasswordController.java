package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PasswordController {

	@Autowired
	PasswordDAO passwordDB;
	
	@RequestMapping("/password")
	public ModelAndView index()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	@RequestMapping("/addInfo")
	public ModelAndView validate(Password password)
	{
		
		ModelAndView mav=new ModelAndView();
		passwordDB.save(password);
		mav.addObject("info", password.isValidPassword());
		mav.setViewName("password.jsp");
		return mav;
	}
		
	
}
