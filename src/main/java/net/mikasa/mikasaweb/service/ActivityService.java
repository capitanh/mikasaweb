package net.mikasa.mikasaweb.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mikasa.mikasaweb.dao.ActivityDAO;
import net.mikasa.mikasaweb.model.Activity;

@Service
public class ActivityService {
  
  private static Logger log = LoggerFactory.getLogger(ActivityService.class);
  
  @Autowired
  private ActivityDAO activityDAO;
  
  public List<Activity> findByOwner(String owner){
    return activityDAO.findByOwner(owner);
  }

}
