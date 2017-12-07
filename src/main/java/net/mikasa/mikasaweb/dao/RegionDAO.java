package net.mikasa.mikasaweb.dao;

import java.lang.Integer;
import net.mikasa.mikasaweb.model.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionDAO extends MongoRepository<Region,Integer> {
  
  //public Region findOne(Integer id);
  //public List<Region>findAll();
}
