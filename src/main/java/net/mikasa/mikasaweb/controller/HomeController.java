package net.mikasa.mikasaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String showHomePage() 
	{
		return "index";
	}
	@RequestMapping("/home")
	public String showHomePage2() 
	{
		return "index";
	}
}
