package net.mikasa.mikasaweb.dao;

import net.mikasa.mikasaweb.model.Region;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionDAO extends JpaRepository<Region,Integer>{
  
  public Region findById(Integer id);
  public List<Region>findAll();

}
