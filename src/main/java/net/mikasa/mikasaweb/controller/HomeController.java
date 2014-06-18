package net.mikasa.mikasaweb.controller;

import net.mikasa.mikasaweb.bean.UserBean;
import net.mikasa.mikasaweb.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@Autowired
	private UserBean userBean;
	
	@RequestMapping("/home")
	public String showHomePage(Model model) 
	{
		String currentUser = userBean.getUser().getUsername();
		model.addAttribute("user",currentUser);
		return "index";
	}

}
