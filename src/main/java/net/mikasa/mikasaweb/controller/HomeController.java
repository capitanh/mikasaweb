package net.mikasa.mikasaweb.controller;

import net.mikasa.mikasaweb.bean.UserBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserBean userBean;

	@RequestMapping("/")
	public String showHomePage(Model model)
	{
		String currentUser = userBean.getUser().getUsername();
		//String appVersion = Manifests.read("Implementation-Version");
		log.info(currentUser);
		model.addAttribute("user",currentUser);
		//model.addAttribute("appVersion",appVersion);
		return "index";
	}

}
