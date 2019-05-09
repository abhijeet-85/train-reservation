package com.narayan.abhijeet.model;

/*
 * Represents a coach in a train
 */
public class Coach {

	private short coachNo;
	
	private CoachClass coachClass;
	
	private boolean[] availableSeats;
	
	private boolean[] bookedSeats;
	
	public Coach(short coachNo, CoachClass coachClass, boolean[] availableSeats) {
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

	public boolean[] getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(boolean[] availableSeats) {
		this.availableSeats = availableSeats;
	}

	public boolean[] getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(boolean[] bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
}
