package com.khadri.spring.mvc.filter.chain.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping("/hit1")
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Controller Invoked");
	}
}
	