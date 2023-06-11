package com.indigo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indigo.Model.FlightRequest;

public interface FlightBookingRepo extends MongoRepository<FlightRequest, String> {

}
