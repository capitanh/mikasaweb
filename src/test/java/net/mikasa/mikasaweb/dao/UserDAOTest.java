package net.mikasa.mikasaweb.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.User;

public class UserDAOTest extends GenericTest{
  
  @Autowired
  private UserDAO userDAO;
  
  @Test
  public void testfindByUsername() {
    User user = userDAO.findByUsername("admin");
    assertThat(user.getPassword()).isEqualTo("admin");
  }

}