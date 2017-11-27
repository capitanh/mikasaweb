package net.mikasa.mikasaweb.dao;

import java.math.BigDecimal;
import net.mikasa.mikasaweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,BigDecimal>  
{
	public User findByUsername(String username);
}
