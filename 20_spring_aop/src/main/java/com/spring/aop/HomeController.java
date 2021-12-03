package com.spring.aop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@Autowired
	private Boss boss;
	
	@Autowired 
	private Manager manager;
	
	@Autowired
	private Employee employee;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		boss.work();
		manager.work();
		employee.work();
		
		System.out.println("\n\n");
		
		boss.getWorkTime();
		manager.getWorkTime();
		employee.getWorkTime();
		
		System.out.println("\n\n");
		
		boss.getInfo("사장", 1200);
		manager.getInfo("매니저", 700);
		employee.getInfo("직원", 300);
		
		return "home";
	}
	
}
