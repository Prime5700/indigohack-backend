package com.indigo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Flight bookings")
public class FlightRequest {
	@Id
	private String flightId;
	private String from;
	private String to;
	private String email;
	private String number;
	private String username;
	private Integer passanger;
	private Integer price;
}
