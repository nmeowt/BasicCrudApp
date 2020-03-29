package com.nmt.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value = "/getAllStudent")
	@ResponseBody
	public String getAllStudent() {
		return null;
	}
	
	@RequestMapping(value = "/getAllClass")
	@ResponseBody
	public String getAllClass() {
		return null;
	}
}
