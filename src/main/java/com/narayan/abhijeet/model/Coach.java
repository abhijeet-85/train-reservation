package com.narayan.abhijeet.model;

import java.util.LinkedList;
import java.util.List;

public class Coach {

	private short coachNo;
	
	private CoachClass coachClass;
	
	private List<Seat> availableSeats = new LinkedList<Seat>();
	
	private List<Seat> bookedSeats = new LinkedList<Seat>();
	
	public Coach(short coachNo, CoachClass coachClass, List<Seat> availableSeats) {
		this.coachNo = coachNo;
		this.coachClass = coachClass;
		this.availableSeats = availableSeats;
	}

	public short getCoachNo() {
		return coachNo;
	}

	public void setCoachNo(short coachNo) {
		this.coachNo = coachNo;
	}

	public CoachClass getCoachClass() {
		return coachClass;
	}

	public void setCoachClass(CoachClass coachClass) {
		this.coachClass = coachClass;
	}

	public List<Seat> getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(List<Seat> availableSeats) {
		this.availableSeats = availableSeats;
	}

	public List<Seat> getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(List<Seat> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
}
