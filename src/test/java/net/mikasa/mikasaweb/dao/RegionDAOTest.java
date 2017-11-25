package net.mikasa.mikasaweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import net.mikasa.mikasaweb.GenericTest;
import net.mikasa.mikasaweb.model.Region;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RegionDAOTest extends GenericTest {
  
  @Autowired
  private RegionDAO regionDAO;
  
  @Test
  public void testFindAll() {
    List<Region>regions = regionDAO.findAll();
    assertTrue(regions.size()==19);
    
  }

}
