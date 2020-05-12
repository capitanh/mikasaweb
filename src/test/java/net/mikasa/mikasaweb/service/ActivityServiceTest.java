package net.mikasa.mikasaweb.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.mikasa.mikasaweb.dao.ActivityDAO;
import net.mikasa.mikasaweb.model.Activity;

@SpringBootTest
public class ActivityServiceTest{
  private static Logger log = LoggerFactory.getLogger(ActivityServiceTest.class);

  @Autowired
  private ActivityService activityService;

  @MockBean
  private ActivityDAO activityDAO;

  @Test
  public void testFindByOwner() {

    List<Activity> lActivitiesFixture = new LinkedList<>();
    lActivitiesFixture.add(new Activity("aaa","01/01/2020","23","123","dummy"));
    lActivitiesFixture.add(new Activity("aaa","01/01/2020","23","123","dummy"));
    lActivitiesFixture.add(new Activity("aaa","01/01/2020","23","123","dummy"));

    Mockito.when(activityDAO.findByOwner("dummy")).thenReturn(lActivitiesFixture);

    List<Activity> lActivities = activityService.findByOwner("dummy");

    assertThat(lActivities.size()).isEqualTo(3);

  }

}
