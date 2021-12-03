package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	public void work() {
		System.out.println("사원의 일을 한다.");
	}
	public void getWorkTime() {
		try {
			Thread.sleep(1200);} catch (InterruptedException e) {e.printStackTrace();}
	}
	public void getInfo(String title, int salary) {
		
	}
}
