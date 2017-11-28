package net.mikasa.mikasaweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.Region;

public class RegionServiceTest extends GenericTest{
  
  @Autowired
  private RegionService regionService;
  
  @Test
  public void testFindById() {
    Region region = regionService.findById(5);
    assertThat(region.getName()).isEqualTo("Cantabria");
  }  
}
