package net.mikasa.mikasaweb.controller;

import net.mikasa.mikasaweb.bean.UserBean;
import net.mikasa.mikasaweb.model.Activity;
import net.mikasa.mikasaweb.service.ActivityService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController
{
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private ActivityService activityService;

	@Autowired
	private UserBean userBean;

	@ModelAttribute("user")
	public String getUser() {
	  return userBean.getUsername();
	}
	
	@ModelAttribute("activities")
	public List<Activity> findByOwner(){
		return activityService.findByOwner("13744917W");
	}

	@RequestMapping("/")
	public ModelAndView showHomePage(Model model)
	{
		//String appVersion = Manifests.read("Implementation-Version");
		//model.addAttribute("appVersion",appVersion);
		log.info("User: " + getUser());
		return new ModelAndView("index");
	}

}
