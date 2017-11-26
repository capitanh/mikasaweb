package net.mikasa.mikasaweb.service;

import static org.junit.Assert.*;

import net.mikasa.mikasaweb.GenericTest;
import net.mikasa.mikasaweb.model.Region;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RegionServiceTest extends GenericTest {

  @Autowired
  private RegionService regionService;
  
  @Test
  public void testFindById() {
    Region region = regionService.findById(5);
    assertEquals(region.getName(), "Cantabria");
  }
}
