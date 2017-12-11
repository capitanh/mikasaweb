package net.mikasa.mikasaweb.dao;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.mikasa.mikasaweb.model.IndicatorType;

public interface IndicatorTypeDAO extends MongoRepository<IndicatorType, UUID>{

}
