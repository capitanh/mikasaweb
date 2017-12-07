package net.mikasa.mikasaweb.controller;

import net.mikasa.mikasaweb.bean.UserBean;
import net.mikasa.mikasaweb.model.Region;
import net.mikasa.mikasaweb.service.RegionService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController
{
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private RegionService regionService;

	@Autowired
	private UserBean userBean;

	@ModelAttribute("user")
	public String getUser() {
	  return userBean.getUser().getUsername();
	}
	
	@ModelAttribute("regions")
	public List<Region> getAllRegions(){
		return regionService.findAll();
	}

	@RequestMapping("/")
	public String showHomePage(Model model)
	{
		//String appVersion = Manifests.read("Implementation-Version");
		//model.addAttribute("appVersion",appVersion);
		log.info("Loading home page");
		return "index";
	}

}
