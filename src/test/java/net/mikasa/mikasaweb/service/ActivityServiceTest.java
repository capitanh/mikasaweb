package net.mikasa.mikasaweb.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.mikasa.mikasaweb.config.GenericTest;
import net.mikasa.mikasaweb.model.Activity;

public class ActivityServiceTest extends GenericTest{
  
  @Autowired
  ActivityService activityService;
  
  @Test
  public void testFindByOwner() {
   List<Activity>activities = activityService.findByOwner("13744917W");
   assertThat(activities.size()).isEqualTo(2);
  }

}
