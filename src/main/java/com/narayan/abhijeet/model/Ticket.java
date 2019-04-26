package com.narayan.abhijeet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {

	private Integer PNRNo;
	
	private List<Passenger> passengers = new ArrayList<Passenger>();
	
	private Date departureDateTime;
	
	private Date arrivaleDateTime;
}
