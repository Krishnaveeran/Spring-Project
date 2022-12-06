package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewsPaperController {

	@Autowired
	NewsPaperDAO newsPaperDB;

	@RequestMapping("/newspaper")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	@RequestMapping("/addInfo")
	public ModelAndView calculate(NewsPaper bill) {
		ModelAndView mav = new ModelAndView();
		newsPaperDB.save(bill);
		mav.addObject("info", bill.countWeekendDays());
		mav.addObject("month", bill.getBillMonth());
		mav.addObject("year", bill.getBillYear());
		mav.setViewName("bill.jsp");
		return mav;

	}

	
	
	
	
}
