package com.indigo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indigo.Model.FlightRequest;
import com.indigo.Model.Flights;
import com.indigo.Repo.FlightBookingRepo;
import com.indigo.Repo.FlightRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Controllers {
	
	private final FlightRepo flightRepo;
	private final FlightBookingRepo flightBookingRepo;
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
	
	@GetMapping("get-flights")
	public List<Flights> getFlights(){
		return flightRepo.findAll();
	}
	
	@PostMapping("set-flights")
	public List<Flights> setFlights(@RequestBody List<Flights> flights){
		return flightRepo.saveAll(flights);
	}
	@PostMapping("set-flight")
	public Flights setFlight(@RequestBody Flights flight){
		return flightRepo.save(flight);
	}
	@PostMapping("book-flight")
	public FlightRequest bookFlight(@RequestBody FlightRequest flightRequest){		
		return flightBookingRepo.save(flightRequest);
	}
	
	@PostMapping("get-my-flight/{id}")
	public FlightRequest getMyFlight(@RequestParam String id){		
		return flightBookingRepo.findById(id).get();
	}
	
}
