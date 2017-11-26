package net.mikasa.mikasaweb.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.mikasa.mikasaweb.dao.RegionDAO;
import net.mikasa.mikasaweb.model.Region;

@Service
@Transactional
public class RegionService {

  @Autowired
  private RegionDAO regionDAO;

  public Region findById(int id)
  {
    return regionDAO.findOne(new BigDecimal(id));
  }

}
