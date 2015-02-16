package net.mikasa.mikasaweb.bean;

import net.mikasa.mikasaweb.model.User;

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserBean 
{
	public User getUser() {
		
		/*UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = new User();
		user.setUsername(userDetails.getUsername());
		return user;*/
		return null;
	}
	
}
