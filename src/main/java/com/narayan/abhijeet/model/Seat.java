package com.narayan.abhijeet.model;

public class Seat {

	private short seatNo;
	
	private Berth berth;

	public Seat(short seatNo, Berth berth) {
		this.seatNo = seatNo;
		this.berth = berth;
	}
	
	public short getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(short seatNo) {
		this.seatNo = seatNo;
	}

	public Berth getBerth() {
		return berth;
	}

	public void setBerth(Berth berth) {
		this.berth = berth;
	}
	
}
