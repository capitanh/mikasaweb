package net.mikasa.mikasaweb.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.Activity;

public class ActivityDAOTest extends GenericTest{
  
  @Autowired
  ActivityDAO activityDAO;
  
  @Test
  public void testFindAll() {
    List<Activity>activities = activityDAO.findAll();
    assertThat(activities.size()).isEqualTo(3);
  }
  
  @Test
  public void testFindByOwner() {
   List<Activity>activities = activityDAO.findByOwner("13744917W");
   assertThat(activities.size()).isEqualTo(2);
  }
  

}
