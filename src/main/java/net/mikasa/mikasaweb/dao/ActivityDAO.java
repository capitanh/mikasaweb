package net.mikasa.mikasaweb.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import net.mikasa.mikasaweb.model.Activity;

public interface ActivityDAO extends MongoRepository<Activity, UUID> {
  
  public List<Activity>findByOwner(String owner);
}
