package com.indigo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Flights")
public class Flights {
	@Id
	private String id;
	private String flightId;
	private String from;
	private String to;
	private Integer price;
}
