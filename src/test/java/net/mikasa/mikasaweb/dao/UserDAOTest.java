package net.mikasa.mikasaweb.dao;

import static org.junit.Assert.*;

import net.mikasa.mikasaweb.GenericTest;
import net.mikasa.mikasaweb.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.springtestdbunit.annotation.DatabaseSetup;

public class UserDAOTest extends GenericTest
{
	
	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void testfindByUsername()
	{
		User user = userDAO.findByUsername("admin");
		assertEquals("admin",user.getPassword());
	}
}
