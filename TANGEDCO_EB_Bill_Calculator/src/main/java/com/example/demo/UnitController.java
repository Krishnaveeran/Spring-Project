package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitController {

	@Autowired
	UnitDAO unitDB;

	@RequestMapping("calculate")
	public ModelAndView calculate() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("show.jsp");
		return mav;
	}

	@RequestMapping("addInfo")
	public ModelAndView add(Unit unit_details) {
		ModelAndView mav = new ModelAndView();
		unitDB.save(unit_details);
		mav.addObject("info", unit_details.calculate());
		mav.setViewName("billcal.jsp");
		return mav;
	}
}
