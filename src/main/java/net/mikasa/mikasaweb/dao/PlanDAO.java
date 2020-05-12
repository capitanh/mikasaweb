package net.mikasa.mikasaweb.dao;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import net.mikasa.mikasaweb.model.Plan;

public interface PlanDAO extends MongoRepository<Plan, UUID> {

  public Plan findByName(String name);

}
