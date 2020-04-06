package com.jalajdemo.jalajdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("name")
	public String name()
	{
		return "jalaj";
	}
}
