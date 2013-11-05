package net.mikasa.mikasaweb.dao;

import static org.junit.Assert.*;
import net.mikasa.mikasaweb.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class UserDAOTest {
	
	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void testfindByUsername()
	{
		User user = userDAO.findByUsername("admin");
		assertNotNull(user);
		assertEquals("secret",user.getPassword());
	}
}
