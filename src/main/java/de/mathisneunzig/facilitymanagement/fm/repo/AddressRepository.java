package de.mathisneunzig.facilitymanagement.fm.repo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.mathisneunzig.facilitymanagement.fm.entity.Address;

public interface AddressRepository extends MongoRepository<Address, UUID> {
	
}
