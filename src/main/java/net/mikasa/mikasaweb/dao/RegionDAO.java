package net.mikasa.mikasaweb.dao;

import java.math.BigDecimal;
import net.mikasa.mikasaweb.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RegionDAO extends JpaRepository<Region,BigDecimal> {

}
