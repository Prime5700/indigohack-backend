package com.indigo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.Model.Flights;

public interface FlightRepo extends MongoRepository<Flights, String> {
	
}
