package net.mikasa.mikasaweb.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.access.annotation.Secured;

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
