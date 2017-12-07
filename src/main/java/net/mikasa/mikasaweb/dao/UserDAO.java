package net.mikasa.mikasaweb.dao;

import java.math.BigDecimal;
import net.mikasa.mikasaweb.model.User;
import org.springframework.data.repository.*;

public interface UserDAO extends Repository<User,BigDecimal>  
{
	public User findByUsername(String username);
}
