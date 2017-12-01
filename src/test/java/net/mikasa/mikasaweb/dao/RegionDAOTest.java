package net.mikasa.mikasaweb.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.Region;

public class RegionDAOTest extends GenericTest{

  @Autowired
  private RegionDAO regionDAO;
  
  @Test
  public void testFindAll() {
    List<Region>regions = regionDAO.findAll();
    assertThat(regions.size()).isEqualTo(5);
  }  
}
