package de.mathisneunzig.facilitymanagement.fm.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.mathisneunzig.facilitymanagement.fm.entity.Building;

public interface BuildingRepository extends MongoRepository<Building, UUID> {
	
	Optional<Building> findByName(String name);

}
