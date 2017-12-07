package net.mikasa.mikasaweb.service;

import java.lang.Integer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.mikasa.mikasaweb.dao.RegionDAO;
import net.mikasa.mikasaweb.model.Region;

@Service
public class RegionService {
  
  @Autowired
  private RegionDAO regionDAO;

  public Region findById(int id)
  {
    return regionDAO.findOne(new Integer(id));
  }
  
  public List<Region> findAll(){
    return regionDAO.findAll();
  }

}
