package net.mikasa.mikasaweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mikasa.mikasaweb.dao.PlanDAO;
import net.mikasa.mikasaweb.model.Plan;

@Service
public class PlanService {

  @Autowired
  private PlanDAO planDAO;

  public Plan findByName(String name) {
    return planDAO.findByName(name);
  }

  public List<Plan> findAll(){
    return planDAO.findAll();
  }

}
